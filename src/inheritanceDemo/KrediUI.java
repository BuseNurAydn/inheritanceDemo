package inheritanceDemo;

public class KrediUI {
//	public void krediHesapla(OgretmenKrediManager kredi) {
//		kredi.hesapla();    //b�yle yazarsak e�er hem �gretmen hem de tar�m i�in ayr� ayr� yazmam�z
		                    //gerekecek
	public void krediHesapla(BaseKrediManager baseKrediManager)	{
		baseKrediManager.hesapla();
		
	}                 
	

}
