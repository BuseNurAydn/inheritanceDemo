package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
	
	//	OgretmenKrediManager hesap = new OgretmenKrediManager();
	//	hesap.hesapla();
     
		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(new OgretmenKrediManager());
		krediUI.krediHesapla(new TarimKrediManager()); //başka managerlerda yazılabilir
	}                                                  //değişikliklere uygundur

}
