public class IntList {
    private int[] data;
    private int size;

    public IntList(){
        data = new int[8];
        size = 0;
    }
    public IntList(int initialCapacity){
        data = new int[initialCapacity];
        size = 0;
    }
    public void add(int element){
        if(data.length>=size) reallocate();
        data[size++] = element;
    }
    private void reallocate(){
        int[] tmp = new int[data.length*2];
        for (int i = 0; i < size ; i++) {
            tmp[i] = data[i];
        }
        data = tmp;

    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        if(data.length == 0){
            sb.append("]");
            return sb.toString();
        }
        for (int i = 0; i < size-1 ; i++) {
            sb.append(data[i]).append(", ");
        }
        sb.append(data[size-1]).append("]");
        return sb.toString();
    }
}
