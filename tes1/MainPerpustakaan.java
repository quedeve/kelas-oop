package tes1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainPerpustakaan {
	public static void main(String[] args) {
		boolean isTambah = true;
		Scanner input = new Scanner(System.in);
		Perpustakaan perpus = new Perpustakaan();
		Map<String, Book> daftarBuku = new LinkedHashMap<String, Book>();
		while (isTambah) {
			System.out.println(" ***********************************************************");
			System.out.println(" Tambah Data Buku ! ");
			System.out.print(" Judul Buku : ");
			Book book = new Book();
			book.setTitle(input.next());
			System.out.print(" Pengarang : ");
			book.setAuthor(input.next());
			System.out.print(" No ISBN : ");
			daftarBuku.put(input.next(), book);
			System.out.print(" Tambah data baru kembali ?(jawab dengan true/false : ");
			isTambah = input.nextBoolean();

		}
		for (Map.Entry<String, Book> entry : daftarBuku.entrySet()) {
			System.out.println(entry.getKey()  );
			Book buku = entry.getValue();
			System.out.println(" Judul  Buku : "+buku.getTitle()+"  penarang "+buku.getAuthor());
		}
		System.out.println("____________________________________________________________________ ");

	}
}
