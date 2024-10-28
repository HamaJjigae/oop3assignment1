package sorting;

import java.util.Comparator;
import shapes.Shapes;

public class MergeSort implements SortAlgos {

    @Override
    public void Sort(Shapes[] data, String sortType) 
    {
        Comparator<Shapes> comparator = getComparator(sortType);
        mergeSort(data, comparator, 0, data.length - 1);
    }

    private void mergeSort(Shapes[] data, Comparator<Shapes> comparator, int left, int right) 
    {
        if (left < right) 
        {
            int mid = left + (right - left) / 2;

            mergeSort(data, comparator, left, mid);
            mergeSort(data, comparator, mid + 1, right);
            merge(data, comparator, left, mid, right);
        }
    }

    private void merge(Shapes[] data, Comparator<Shapes> comparator, int left, int mid, int right) 
    {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Shapes[] L = new Shapes[n1];
        Shapes[] R = new Shapes[n2];

        System.arraycopy(data, left, L, 0, n1);
        System.arraycopy(data, mid + 1, R, 0, n2);

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) 
        {
            if (comparator != null) 
            {
                if (comparator.compare(L[i], R[j]) >= 0) 
                {
                    data[k++] = L[i++];
                } 
                else 
                {
                    data[k++] = R[j++];
                }
            } 
            else 
            {
                if (L[i].compareTo(R[j]) >= 0) 
                {
                    data[k++] = L[i++];
                } 
                else 
                {
                    data[k++] = R[j++];
                }
            }
        }

        while (i < n1) 
        {
            data[k++] = L[i++];
        }

        while (j < n2) 
        {
            data[k++] = R[j++];
        }
    }
}