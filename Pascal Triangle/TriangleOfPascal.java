class TriangleOfPascal {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) return triangle;
        
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);
        
        for(int i = 1; i<numRows; i++){
            List<Integer> current_row = new ArrayList<>();
            current_row.add(1);
            
            List<Integer> previous_row = triangle.get(i-1);
            
            for(int j = 1;j<i;j++){
                current_row.add(previous_row.get(j-1)+previous_row.get(j));
            }
            
            current_row.add(1);
            triangle.add(current_row);
        }
        return triangle;
    }
}