import java.util.LinkedList;

public class linked_list2 {
    public static void main(String[] args) {
        LinkedList <String> no_bp = new LinkedList<>();
        LinkedList <String> nama_mahasiswa = new LinkedList<>();
        LinkedList <String> alamat = new LinkedList<>();

        //add
        nama_mahasiswa.add("Sasha Alex Sloan");
        no_bp.add("2111524001");
        alamat.add("Pasar Baru");

        nama_mahasiswa.add("Tessa Violet");
        no_bp.add("2111524002");
        alamat.add("Limau Manis");

        nama_mahasiswa.add("Chevy");
        no_bp.add("2111524003");
        alamat.add("Jati");

        nama_mahasiswa.add("Boy Pablo");
        no_bp.add("2111524004");
        alamat.add("Indarung");

        nama_mahasiswa.add("Luke Chiang");
        no_bp.add("2111524005");
        alamat.add("Gunung Pangilun");

        System.out.println("-----MENAMBAHKAH DATA MAHASISWA-----");
        System.out.println("Nama Mahasiswa : "+nama_mahasiswa);
        System.out.println("NIM : "+no_bp);
        System.out.println("Alamat : "+alamat);
        System.out.println(" ");


        //set
        nama_mahasiswa.set(3, "Simon Dominic");
        no_bp.set(0, "2111524015");
        alamat.set(1, "Los Angeles");

        System.out.println("-----MENYISIPKAN DATA MAHASISWA-----");
        System.out.println("Nama Mahasiswa : "+nama_mahasiswa);
        System.out.println("NIM : "+no_bp);
        System.out.println("Alamat : "+alamat);
        System.out.println(" ");  


        //remove
        nama_mahasiswa.removeFirst();
        no_bp.removeLast();
        alamat.remove(4);

        System.out.println("-----MENGHAPUS DATA MAHASISWA-----");
        System.out.println("Nama Mahasiswa : "+nama_mahasiswa);
        System.out.println("NIM : "+no_bp);
        System.out.println("Alamat : "+alamat);
        System.out.println(" ");


        //get
        System.out.println("-----METODE GET-----");
        System.out.println("Nama Mahasiswa : "+nama_mahasiswa.get(2));
        System.out.println("NIM : "+no_bp.get(2));
        System.out.println("Alamat : "+alamat.get(2));
        System.out.println(" ");


        //pop
        nama_mahasiswa.pop();
        no_bp.pop();
        alamat.poll();

        System.out.println("-----METODE POP-----");
        System.out.println("Nama Mahasiswa : "+nama_mahasiswa);
        System.out.println("NIM : "+no_bp);
        System.out.println("Alamat : "+alamat);
        System.out.println(" ");


        //push
        nama_mahasiswa.push("Liana Flores");
        no_bp.push("2111524009");
        alamat.push("Lolong Belanti");

        System.out.println("-----METODE PUSH-----");
        System.out.println("Nama Mahasiswa : "+nama_mahasiswa);
        System.out.println("NIM : "+no_bp);
        System.out.println("Alamat : "+alamat);
        System.out.println(" ");


        //indexOf
        System.out.println("-----METODE INDEXOF-----");
        System.out.println("Nama Mahasiswa : "+nama_mahasiswa.indexOf("Boy Pablo"));
        System.out.println("NIM : "+no_bp.indexOf("2111524005"));
        System.out.println("Alamat : "+alamat.indexOf("Jati"));
        System.out.println(" ");

        //clear
        nama_mahasiswa.clear();

        //isEmpty
        System.out.println("-----METODE ISEMPTY-----");
        System.out.println("Is Nama Mahasiswa Empty? "+nama_mahasiswa.isEmpty());
        System.out.println("Is NIM Empty? "+no_bp.isEmpty());
        System.out.println("Is Alamat Empty? "+alamat.isEmpty());
        System.out.println(" ");
    }
    
}
