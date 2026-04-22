import java.util.ArrayList;
import java.util.Arrays;
public class NArrayList <E> {
    private E[] data;
    private int nrElements;
    private int maxSize;

    public NArrayList(){
        nrElements = 0;
        maxSize = 0;
        maxSize = 10;
        data = (E[]) new Object[maxSize];
    }
    public boolean add(E element){
        if(nrElements==maxSize)
            reallocate();
        data[nrElements++]=element;
        return true;
    }
    public E get(int index){
        if(0<=index && index < nrElements)
            return data[index];
        throw new ArrayIndexOutOfBoundsException(index);
    }

    private void reallocate(){
        maxSize*=2;
        data=Arrays.copyOf(data,maxSize);
    }

    public ArrayList<String> getCopy(){
        ArrayList<String> copy = new ArrayList<>();

        for (int i = 0; i <nrElements ; i++) {
            copy.add(data[i].toString());
        }
        return copy;
    }


    public E remove(int index){
        if(index >= nrElements) throw new ArrayIndexOutOfBoundsException("invalid index");
        E tmp = data[index];
        for (int i = index; i < nrElements-1 ; i++) {
            data[index] = data[index+1];
        }
        data[nrElements-1] = null;
        nrElements--;
        return tmp;

    }

    public void set(E element){

    }
    public int indexOf(E element){
        for (int i = 0; i < nrElements ; i++) {
            if (data[i] == element) return  i;
        }
        return -1;
    }
    public static void replace(ArrayList<String> aList, String oldItem, String newItem){
       // int index;
        for (int i = 0; i < aList.size(); i++) {
            if(aList.get(i).contains(oldItem)){
                aList.set(i, newItem);
            }
        }
    }

    public static void delete(ArrayList<String> aList, String target){
        aList.remove(target);
    }



    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        if(nrElements == 0 ) {
            sb.append("]");
            return sb.toString();
        }
        for (int i = 0; i < nrElements-1 ; i++) {
            sb.append(data[i]).append(", ");
        }
        sb.append(data[nrElements-1]).append("]");
        return sb.toString();
    }

}
