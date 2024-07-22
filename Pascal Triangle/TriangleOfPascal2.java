class TriangleOfPascal2 {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();
        for(int i = 0; i < numRows; i++){
            row.add(1);
                System.out.println("I value **** "+ i);
            for(int j = i - 1; j > 0; j--){
                System.out.println("J value is "+ j);
                row.set(j, row.get(j) + row.get(j-1));
            }
            triangle.add(new ArrayList<Integer>(row));
            System.out.println(row.toString());
        }
        
        return triangle;
    }
}