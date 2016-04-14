package rischiovalore.model;

public class Dato {

	//elementi
	private String codCliente;
	private String sottofamiglia;
	private String marchio;
	private int codProduttore;
	private int codProdotto;
	private float listino;
	private float fatturatoRicambisti;
	private float volumeRicambisti;
	private float kgAcquisto;
	private float fatturato;
	private float volumeVenduto;
	private String data;
	private int regione;
	
	public Dato(String codCliente, String sottofamiglia, String marchio, int codProduttore, int codProdotto,
			float listino, float fatturatoRicambisti, float volumeRicambisti, float kgAcquisto, float fatturato,
			float volumeVenduto, String data, int regione) {
		this.codCliente = codCliente;
		this.sottofamiglia = sottofamiglia;
		this.marchio = marchio;
		this.codProduttore = codProduttore;
		this.codProdotto = codProdotto;
		this.listino = listino;
		this.fatturatoRicambisti = fatturatoRicambisti;
		this.volumeRicambisti = volumeRicambisti;
		this.kgAcquisto = kgAcquisto;
		this.fatturato = fatturato;
		this.volumeVenduto = volumeVenduto;
		this.data = data;
		this.regione = regione;
	}

	public String getCodCliente() {
		return codCliente;
	}

	public String getSottofamiglia() {
		return sottofamiglia;
	}

	public String getMarchio() {
		return marchio;
	}

	public int getCodProduttore() {
		return codProduttore;
	}

	public int getCodProdotto() {
		return codProdotto;
	}

	public float getListino() {
		return listino;
	}

	public float getFatturatoRicambisti() {
		return fatturatoRicambisti;
	}

	public float getVolumeRicambisti() {
		return volumeRicambisti;
	}

	public float getKgAcquisto() {
		return kgAcquisto;
	}

	public float getFatturato() {
		return fatturato;
	}

	public float getVolumeVenduto() {
		return volumeVenduto;
	}

	public String getData() {
		return data;
	}

	public int getRegione() {
		return regione;
	}
	
	
	
	
}
