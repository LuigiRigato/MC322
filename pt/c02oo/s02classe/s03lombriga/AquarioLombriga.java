package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga
{
   int tamanho_aquario, tamanho_lombriga, posicao;
	
	AquarioLombriga(int tamanho_aquario, int tamanho_lombriga, int posicao)
	{
		this.tamanho_aquario = tamanho_aquario;
		
		if (posicao < 1 || posicao > tamanho_aquario)
		// se posicao invalida
		{
			this.tamanho_lombriga = tamanho_lombriga;
			this.posicao = 1;
		}
		if (tamanho_aquario < tamanho_lombriga + this.posicao - 1)
		// se lombriga nao couber
		{
			this.tamanho_lombriga = tamanho_aquario;
			this.posicao = 1;
		}
		else
		{
			this.tamanho_lombriga = tamanho_lombriga;
			this.posicao = posicao;	
		}
	}
	
	void crescer()
	{
		if (tamanho_aquario >= tamanho_lombriga + posicao - 1)
		{
			tamanho_lombriga++;
		}
	}
}