package LPOO2017Interface;

public class Implement_Array implements Interface_aluno {

	protected float[] notas;

	public Implement_Array(float[] notas) {
		this.notas = notas;
	}

	public float calcularMedia(float[] nota) {
		float media = 0;
		float soma = 0;

		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
			if (i <= notas.length) {
				media = soma / notas.length;
			}
		}
		return media;
	}

	public void addNewNota() {

	}

	public void removeUltimaNota() {

	}

	public float mostrarUltimaNota() {
		float resultado = 0;
		return resultado;
		
	}

	public float[] getNotas() {
		return notas;
	}

	public void setNotas(float[] notas) {
		this.notas = notas;
	}

}
