package LPOO2017Interface;

public interface Interface_aluno {
	
	// 1 - Crie uma interface chamada Aluno onde ela terá os métodos:
	//  Calcular a media (lê todas as notas cadastradas e calcula a media);
	//  Adiciona uma nova nota;
	//  Remove a última nota;
	//  Mostra a maior nota;

	public float calcularMedia(float[] nota);

	public void addNewNota();

	public void removeUltimaNota();

	public float mostrarUltimaNota();

}
