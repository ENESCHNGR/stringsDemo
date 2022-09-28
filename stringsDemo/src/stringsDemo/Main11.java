package stringsDemo;

public class Main11 {

	public static void main(String[] args) {
      String mesaj = "     Bugün hava çok güzel   ";
       System.out.println(mesaj);
       
       System.out.println("Eleman Sayısı: "+mesaj.length());
       System.out.println("5.eleman: "+mesaj.charAt(4));
       System.out.println(mesaj.concat(" Yaşasın!"));
       System.out.println(mesaj.startsWith("B"));
       System.out.println(mesaj.endsWith("l"));
       char[] karakterler = new char[5];
       mesaj.getChars(0, 5, karakterler, 0);
       System.out.println(karakterler);
       System.out.println(mesaj.indexOf("v"));
       System.out.println(mesaj.lastIndexOf("n"));
       
       //Değişkenin ait olduğu metinin içeriğini değiştiririz.
       System.out.println(mesaj.replace(' ','-'));
       //metinin belli bir yerinden sonrasını almak istiyorsak substring kullanırız.
       System.out.println(mesaj.substring(2));
       System.out.println(mesaj.substring(2,4));
       
       //Değişkenin ait olduğu metinin parçalanması için kullanılır.
       for (String Ayır:mesaj.split(" ")){
		System.out.println(Ayır);  
		
		//Değişkenin ait olduğu metini küçük veya büyük harf yapabiliriz.Ayrıca boşluklar kapatolabilir.
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());


       }
    
       
       

	}

}
