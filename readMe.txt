To install this program:

First, ensure that you have Java installed on your system. You can get this from the Oracle website or OpenJDK. (Check installation with java -version).

Second, download Sort.jar and place it in any directory in your computer.

Third, make sure that the text files are located in the "res" directory which should be in the same folder as Sort.jar. (Both the executable and the res folder are in the same directory).

Fourth, open a terminal and navigate to where Sort.jar is.

Fifth, run the application using the following command:
java -jar Sort.jar -f"textfilename.txt" -t(a/h/v) -s(b/z/i/m/q/s)
-t:
	a is area	h is height 	v is volume
-s
	b is bubblesort	z is heapsort	i is insertionsort	m is mergesort	q is quicksort	s is selectionsort

Finally, if you have a FileNotFoundException, make sure the text file is correctly named and placed. (ensure that you type the name in quotations if your terminal requires that.)