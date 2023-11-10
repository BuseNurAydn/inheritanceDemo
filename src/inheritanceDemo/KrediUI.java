package inheritanceDemo;

public class KrediUI {
//	public void krediHesapla(OgretmenKrediManager kredi) {
//		kredi.hesapla();    //böyle yazarsak eğer hem ögretmen hem de tarım için ayrı ayrı yazmamız
		                    //gerekecek
	public void krediHesapla(BaseKrediManager baseKrediManager)	{
		baseKrediManager.hesapla();
		
	}                 
	

}
