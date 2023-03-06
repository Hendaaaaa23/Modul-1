public class kota<E> {
    private E element;

    public kota(E kota){

    }
    public E getElement(){
        return element;

    }
    public static void main(String[] args){
        kota<Integer> jumlahkota = new kota<Integer>(9);
        kota<String> namakota = new kota<String>("Malang");
        System.out.println("jumlah kota di Jawa Timur : " + jumlahkota.getElement() + "kota");
        System.out.println("salah satu kota di Jawa Timur : kota" + namakota.getElement());
    }
}
