public class TestDemo {
    public static void main(String[] args) {
        HeapDemo heap = new HeapDemo();
        int[] array = {27,49,65,25,37,34,19,18,15,28};
        heap.createBigHeap(array);
        heap.show();
        heap.push(78);
        heap.show();
        heap.poll();
        heap.show();
    }
}
