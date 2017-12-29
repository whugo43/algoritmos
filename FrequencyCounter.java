public class FrequencyCounter {

    // Do not instantiate.
    private FrequencyCounter() { }

    /**
     * Reads in a command-line integer and sequence of words from
     * standard input and prints out a word (whose length exceeds
     * the threshold) that occurs most frequently to standard output.
     * It also prints out the number of words whose length exceeds
     * the threshold and the number of distinct such words.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int distinct = 0, words = 0;
        int distinctrb = 0, wordsrb = 0;   
        int distinctlp = 0, wordslp = 0;   
		int minlen = Integer.parseInt(args[0]);
        BinarySearchST<String, Integer> st = new BinarySearchST<String, Integer>();
	   RedBlackBST<String, Integer> rbst = new RedBlackBST<String, Integer>();
	   LinearProbingHashST<String, Integer> lpst = new LinearProbingHashST<String, Integer>();

        // compute frequency counts
long TInicio, TFin, tiempo;
TInicio = System.currentTimeMillis();
StdIn StdIn1=StdIn;
StdIn StdIn2=StdIn;

        while (!StdIn.isEmpty()) {
            String key = StdIn.readString();
            if (key.length() < minlen) continue;
            words++;
            if (st.contains(key)) {
                st.put(key, st.get(key) + 1);
            }
            else {
                st.put(key, 1);
                distinct++;
            }}
        String max = "";
        st.put(max, 0);
        for (String word : st.keys()) {
            if (st.get(word) > st.get(max))
                max = word;
	  }
TFin = System.currentTimeMillis();


long TInicio1, TFin1, tiempo1;
TInicio1 = System.currentTimeMillis();
while (!StdIn1.isEmpty()) {
            String key = StdIn1.readString();
		if (key.length() < minlen) continue;
            wordsrb++;
		if (rbst.contains(key)) {
                rbst.put(key, rbst .get(key) + 1);
            }
            else {
                rbst.put(key, 1);
                distinctrb++;
            }}
        String maxrb = "";
        st.put(maxrb, 0);
        for (String word : rbst.keys()) {
            if (rbst.get(word) > rbst.get(max))
                maxrb = word;
        }
TFin1 = System.currentTimeMillis();


long TInicio2, TFin2, tiempo2;
TInicio2 = System.currentTimeMillis();
while (!StdIn2.isEmpty()) {
            String key = StdIn2.readString();

		if (key.length() < minlen) continue;
            wordslp++;
		if (lpst.contains(key)) {
                lpst.put(key, lpst .get(key) + 1);
            }
            else {
                lpst.put(key, 1);
                distinctlp++;
            }}
        String maxlp = "";
        st.put(maxlp, 0);
        for (String word : lpst.keys()) {
            if (lpst.get(word) > lpst.get(max))
                maxlp = word;

        }
        TFin2 = System.currentTimeMillis();


        
	   StdOut.println("	BUSQUEDA BINARIA");
	   tiempo = TFin - TInicio;
         
        System.out.println(tiempo +" segundos");
        StdOut.println(max + " " + st.get(max));
        StdOut.println("distinct = " + distinct);
        StdOut.println("words    = " + words);
	   System.out.println(tiempo +" segundos");

	   StdOut.println("	");
	   StdOut.println("	BUSQUEDA ARBOL ROJO NEGRO");
	   tiempo1 = TFin1 - TInicio1;
        StdOut.println("distinctrb = " + distinctrb);
        StdOut.println("words    = " + wordsrb);
        System.out.println(tiempo1 +" segundos");

	   StdOut.println("	");
	   StdOut.println("	Tabla Hash con Consulta Lineal");
        tiempo2 = TFin2 - TInicio2;
        StdOut.println("distinctlp = " + distinctlp);
        StdOut.println("words    = " + wordslp);
        System.out.println(tiempo2 +" segundos");

    }
}