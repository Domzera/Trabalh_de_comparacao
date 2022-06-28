import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class trabalho {
	
	public static void main (String[] args) {
		String resposta1="S",veloza="",velozb="";
		int resposta2=0,respostaSelecao=0,respostaInsercao=0,respostaBolha=0,respostaMerge=0;
		int respostaSort=0,respostaArrayS=0,respostaArrayL=0,respostaTamanho=0,tamanho=0;
		int respostaArrayN=0,r=0,rapidoa=100000,rapidob=100000;
		
		//Chama a classe imprime para todos
		Imprime imprime = new Imprime();
		Scanner leia = new Scanner(System.in);
		Scanner leiaString = new Scanner(System.in);
		
		//Inicia a contagem total do tempo de criação as arrays
			Instant comeca = Instant.now();
		
		//Cria as arrays
			Cria cria = new Cria();
			
		//Cria o resultado
			Resultado resultado[] = new Resultado[50];
			
		//Inicia as classes nescessarias
			Selecao selecao = new Selecao();
			Insercao insercao = new Insercao();
			Bolha bolha = new Bolha();
			Merge merge = new Merge();
			Sort sort = new Sort();
			ArrayS arrayS = new ArrayS();
			ArrayL arrayL = new ArrayL();
			
		//Funcao que ordena por insercao em ordem crescente
			OrdenaInsercaoCre ordenaInsercaoCre = new OrdenaInsercaoCre();
		//Funcao que ordena por insercao em ordem decrescente
			OrdenaInsercaoDecre ordenaInsercaoDecre = new OrdenaInsercaoDecre();
			
		//Cria as array desordenadas
			System.out.println("Qual o tamanho que voce deseja?"+
								"\n1 -> 100"+
								"\n2 -> 1000"+
								"\n3 -> 10000"+
								"\n4 -> 100000");
			respostaTamanho = leia.nextInt();
			switch(respostaTamanho){
				case(1)://100
					tamanho=100;
				break;
				case(2):
					tamanho=1000;
				break;
				case(3):
					tamanho=10000;
				break;
				case(4):
					tamanho=100000;
				break;
			}
				//Cria nova arrays
				int[] novo = arrais(tamanho);
				//Imprime para conferencia
				System.out.println("Fora de ordem:\n");
				imprime.imprimeTraco(novo);
			
		while(resposta1.equals("S")){
		
		
			System.out.println("Qual teste voce deseja fazer?"+
								"\n1- Selecao"+
								"\n2- Insercao"+
								"\n3- Bolhas"+
								"\n4- Merge"+
								"\n5- Sort"+
								"\n6- Arrays"+ //Tem que fazer
								"\n7- Gostaria de alterar os arrays?");
			resposta2=leia.nextInt();
			resultado[r] = new Resultado();
			switch(resposta2){
					case(1)://Selecao
					resultado[r].setNome("Selecao");
						System.out.println("Como voce deseja imprimir?"+
											"\n 1)-Sem formatacao"+
											"\n 2)-Com um traco entre os numeros"+
											"\n 3)-Pulando Linhas ou"+
											"\n 4)-Nem imprime");
						respostaSelecao=leia.nextInt();
						switch(respostaSelecao){
							case(1)://Sem formatacao
							//---Inicia a marcar o tempo para ordenacao crescente
								Instant tempoSeleSF = Instant.now();
							//---Copia array para ordena por Selecao em ordem crescente
								int[] cemSeleCreSF = new int[novo.length];
								cemSeleCreSF = selecao.crescente(novo);
								Instant tempoSeleSF1 = Instant.now();
								
							//--Copia array para ordenar por Selecao em ordem decrescente
								int[] cemSeleDecresceSF = new int[novo.length];
								cemSeleDecresceSF = selecao.decescente(novo);
								Instant tempoSeleSF2 = Instant.now();
								
							//--Imprime
								imprime.imprimeLimpo(cemSeleCreSF);
								imprime.imprimeLimpo(cemSeleDecresceSF);

								Duration tempoSeleSF3 = Duration.between(tempoSeleSF,tempoSeleSF1);
								Duration tempoSeleSF4 = Duration.between(tempoSeleSF1,tempoSeleSF2);
							//Ultimo print
								System .out.println("\n\nLevou " + tempoSeleSF3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoSeleSF4.getNano() + " nanoseconds para ordenar decrescente");	
								resultado[r].setValorCres(tempoSeleSF3.getNano());
								resultado[r].setValorDecre(tempoSeleSF4.getNano());
								
							break;
							case(2)://Com traco
							//---Inicia a marcar o tempo para a ordenacao crescente
								Instant tempoSeleT = Instant.now();
								int[] cemSeleCreT = new int[novo.length];
								cemSeleCreT = selecao.crescente(novo);
								Instant tempoSeleT1 = Instant.now();

							//---Copia array para ordena por Selecao---
								int[] cemSeleDecresceT = new int[novo.length];
								cemSeleDecresceT = selecao.decescente(novo);
								Instant tempoSeleT2 = Instant.now();
								
							//--Imprime
								imprime.imprimeTraco(cemSeleCreT);
								imprime.imprimeTraco(cemSeleDecresceT);
							
								Duration tempoSeleT3 = Duration.between(tempoSeleT,tempoSeleT1);
								Duration tempoSeleT4 = Duration.between(tempoSeleT1,tempoSeleT2);
							//Ultimo print
								System .out.println("\n\nLevou " + tempoSeleT3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoSeleT4.getNano() + " nanoseconds para ordenar decrescente");	
								resultado[r].setValorCres(tempoSeleT3.getNano());
								resultado[r].setValorDecre(tempoSeleT4.getNano());
							break;
							case(3)://Pula Linha
							//---Inicia a marcar o tempo
								Instant tempoSeleP = Instant.now();
							//---Copia array para ordena
								int[] cemSeleCreP = new int[novo.length];
								cemSeleCreP = selecao.crescente(novo);
								Instant tempoSeleP1 = Instant.now();
							
							//---Copia array para ordena	
								int[] cemSeleDecresceP = new int[novo.length];
								cemSeleDecresceP = selecao.decescente(novo);
								Instant tempoSeleP2 = Instant.now();
								
							//--Imprime por Seleção--
								imprime.imprimePorLinha(cemSeleCreP);
								imprime.imprimePorLinha(cemSeleDecresceP);
								
								Duration tempoSeleP3 = Duration.between(tempoSeleP,tempoSeleP1);
								Duration tempoSeleP4 = Duration.between(tempoSeleP1,tempoSeleP2);
							//Ultimo print
								System .out.println("\n\nLevou " + tempoSeleP3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoSeleP4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempoSeleP3.getNano());
								resultado[r].setValorDecre(tempoSeleP4.getNano());
							break;
							case(4)://Nem imprime
							//---Inicia a marcar o tempo
								Instant tempoSeleN = Instant.now();
							//---Copia array para ordena por Selecao---
								int[] cemSeleCreNP = new int[novo.length];
								cemSeleCreNP = selecao.crescente(novo);
								Instant tempoSeleN1 = Instant.now();
								
								int[] cemSeleDecresceNP = new int[novo.length];
								cemSeleDecresceNP = selecao.decescente(novo);
								Instant tempoSeleN2 = Instant.now();
								
								Duration tempoSeleN3 = Duration.between(tempoSeleN,tempoSeleN1);
								Duration tempoSeleN4 = Duration.between(tempoSeleN1,tempoSeleN2);
							//Ultimo print
								System .out.println("\n\nLevou " + tempoSeleN3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoSeleN4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempoSeleN3.getNano());
								resultado[r].setValorDecre(tempoSeleN4.getNano());
							break;
						}
					break;
					case(2)://Insercao
					resultado[r].setNome("Insercao");
						System.out.println("Como voce deseja imprimir?"+
											"\n 1)-Sem formatacao"+
											"\n 2)-Com um traco entre os numeros"+
											"\n 3)-Pulando Linhas ou"+
											"\n 4)-Nem imprime");
						respostaInsercao=leia.nextInt();
						switch(respostaInsercao){
							case(1)://Sem formatacao
							//---Inicia a marcar o tempo
								Instant tempoInserSF = Instant.now();
							//-----Copia array para ordena por Insercao-----								
								int[] cemInserCre = new int[novo.length];
								cemInserCre = insercao.crescente(novo);
								Instant tempoInserSF1 = Instant.now();
								
							//-----Copia array para ordena por Insercao-----
								int[] cemInserDecre = new int[novo.length];
								cemInserDecre = insercao.decrescente(novo);
								Instant tempoInserSF2 = Instant.now();
								
							//--Imprime
								imprime.imprimeLimpo(cemInserCre);
								imprime.imprimeLimpo(cemInserDecre);
								
								Duration tempoInserSF3 = Duration.between(tempoInserSF,tempoInserSF1);
								Duration tempoInserSF4 = Duration.between(tempoInserSF1,tempoInserSF2);
							//Ultimo print
								System .out.println("\n\nLevou " + tempoInserSF3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoInserSF4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempoInserSF3.getNano());
								resultado[r].setValorDecre(tempoInserSF4.getNano());
							break;
							case(2)://Traco
							//---Inicia a marcar o tempo
								Instant tempoInserT = Instant.now();
							//-----Copia array para ordena por Insercao-----
								int[] cemInserCreT = new int[novo.length];
								cemInserCreT = insercao.crescente(novo);
								Instant tempoInserT1 = Instant.now();
							
							//-----Copia array para ordena por Insercao-----	
								int[] cemInserDecreT = new int[novo.length];
								cemInserDecreT = insercao.decrescente(novo);
								Instant tempoInserT2 = Instant.now();
								
							//--Imprime
								imprime.imprimeTraco(cemInserCreT);
								imprime.imprimeTraco(cemInserDecreT);
								
								Duration tempoInserT3 = Duration.between(tempoInserT,tempoInserT1);
								Duration tempoInserT4 = Duration.between(tempoInserT1,tempoInserT2);
							//Ultimo print
								System .out.println("\n\nLevou " + tempoInserT3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoInserT4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempoInserT3.getNano());
								resultado[r].setValorDecre(tempoInserT4.getNano());
							break;
							case(3)://Pula Linha
							//---Inicia a marcar o tempo
								Instant tempoInserP = Instant.now();
							//-----Copia array para ordena por Insercao-----
								int[] cemInserCreP = new int[novo.length];
								cemInserCreP = insercao.crescente(novo);
								Instant tempoInserP1 = Instant.now();
							
							//-----Copia array para ordena por Insercao-----	
								int[] cemInserDecreP = new int[novo.length];
								cemInserDecreP = insercao.decrescente(novo);
								Instant tempoInserP2 = Instant.now();
								
							//--Imprime por Inserção--
								imprime.imprimePorLinha(cemInserCreP);
								imprime.imprimePorLinha(cemInserDecreP);
								
								Duration tempoInserP3 = Duration.between(tempoInserP,tempoInserP1);
								Duration tempoInserP4 = Duration.between(tempoInserP1,tempoInserP2);
							//Ultimo print
								System .out.println("\n\nLevou " + tempoInserP3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoInserP4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempoInserP3.getNano());
								resultado[r].setValorDecre(tempoInserP3.getNano());
							break;
							case(4)://Nem imprime
							//---Inicia a marcar o tempo
								Instant tempoInseN = Instant.now();
							//-----Copia array para ordena por Bolha-----
								int[] cemBolhaCreNP = new int[novo.length];
								cemBolhaCreNP = bolha.crescente(novo);
								Instant tempoInseN1 = Instant.now();
								
								int[] cemBolhaDecreNP = new int[novo.length];
								cemBolhaDecreNP = bolha.decrescente(novo);
								Instant tempoInseN2 = Instant.now();
								
								Duration tempoInseN3 = Duration.between(tempoInseN,tempoInseN1);
								Duration tempoInseN4 = Duration.between(tempoInseN1,tempoInseN2);
							//Ultimo print
								System .out.println("\n\nLevou " + tempoInseN3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoInseN4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempoInseN3.getNano());
								resultado[r].setValorDecre(tempoInseN4.getNano());
							break;
						}
					break;
					case(3)://Bolhas
					resultado[r].setNome("Bolha");
						System.out.println("Como voce deseja imprimir?"+
											"\n 1)-Sem formatacao"+
											"\n 2)-Com um traco entre os numeros"+
											"\n 3)-Pulando Linhas ou"+
											"\n 4)-Nem imprime");
						respostaBolha=leia.nextInt();
						switch(respostaBolha){
							case(1)://Sem Formatacao
							//---Inicia a marcar o tempo
								Instant tempo = Instant.now();
							//-----Copia array para ordena por Bolha-----
								int[] cemBolhaCreSF = new int[novo.length];
								cemBolhaCreSF = bolha.crescente(novo);
								Instant tempo1 = Instant.now();
							
							//-----Copia array para ordena por Bolha-----
								int[] cemBolhaDecreSF = new int[novo.length];
								cemBolhaDecreSF = bolha.decrescente(novo);
								Instant tempo2 = Instant.now();
								
							//--Imprime por Bolha--
								imprime.imprimeLimpo(cemBolhaCreSF);
								imprime.imprimeLimpo(cemBolhaDecreSF);
								
								Duration tempo3 = Duration.between(tempo,tempo1);
								Duration tempo4 = Duration.between(tempo1,tempo2);
							//Ultimo print
								System .out.println("\n\nLevou " + tempo3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempo4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempo3.getNano());
								resultado[r].setValorDecre(tempo4.getNano());
							break;
							case(2)://Traco
							//---Inicia a marcar o tempo
								Instant tempoBolhaT = Instant.now();
							//-----Copia array para ordena por Bolha-----
								int[] cemBolhaCreT = new int[novo.length];
								cemBolhaCreT = bolha.crescente(novo);
								Instant tempoBolhaT1 = Instant.now();
							
							//-----Copia array para ordena por Bolha-----	
								int[] cemBolhaDecreT = new int[novo.length];
								cemBolhaDecreT = bolha.decrescente(novo);
								Instant tempoBolhaT2 = Instant.now();
							
							//--Imprime por Bolha--
								imprime.imprimeTraco(cemBolhaCreT);	
								imprime.imprimeTraco(cemBolhaDecreT);
								
								Duration tempoBolhaT3 = Duration.between(tempoBolhaT,tempoBolhaT1);
								Duration tempoBolhaT4 = Duration.between(tempoBolhaT1,tempoBolhaT2);
							//Ultimo print
								System .out.println("\n\nLevou " + tempoBolhaT3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoBolhaT4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempoBolhaT3.getNano());
								resultado[r].setValorDecre(tempoBolhaT4.getNano());
							break;
							case(3)://Pula Linha
							//---Inicia a marcar o tempo
								Instant tempoBolhaP = Instant.now();
							//-----Copia array para ordena por Bolha-----
								int[] cemBolhaCreP = new int[novo.length];
								cemBolhaCreP = bolha.crescente(novo);	
								Instant tempoBolhaP1 = Instant.now();
							
							//-----Copia array para ordena por Bolha-----	
								int[] cemBolhaDecreP = new int[novo.length];
								cemBolhaDecreP = bolha.decrescente(novo);
								Instant tempoBolhaP2 = Instant.now();
								
							//--Imprime por Bolha--
								imprime.imprimePorLinha(cemBolhaCreP);	
								imprime.imprimePorLinha(cemBolhaDecreP);
								
								Duration tempoBolhaP3 = Duration.between(tempoBolhaP,tempoBolhaP1);
								Duration tempoBolhaP4 = Duration.between(tempoBolhaP1,tempoBolhaP2);
							//Ultimo print
								System .out.println("\n\nLevou " + tempoBolhaP3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoBolhaP4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempoBolhaP3.getNano());
								resultado[r].setValorDecre(tempoBolhaP4.getNano());
							break;
							case(4)://Nem imprime
							//---Inicia a marcar o tempo
								Instant tempoBolhaN = Instant.now();
							//-----Copia array para ordena por Bolha-----
								int[] cemBolhaCreNP = new int[novo.length];
								cemBolhaCreNP = bolha.crescente(novo);
								Instant tempoBolhaN1 = Instant.now();
								
								int[] cemBolhaDecreNP = new int[novo.length];
								cemBolhaDecreNP = bolha.decrescente(novo);
								Instant tempoBolhaN2 = Instant.now();
								
								Duration tempoBolhaN3 = Duration.between(tempoBolhaN,tempoBolhaN1);
								Duration tempoBolhaN4 = Duration.between(tempoBolhaN1,tempoBolhaN2);
							//Ultimo print
								System .out.println("\n\nLevou " + tempoBolhaN3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoBolhaN4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempoBolhaN3.getNano());
								resultado[r].setValorDecre(tempoBolhaN4.getNano());
							break;
						}
					break;
					case(4)://Merge
					resultado[r].setNome("Merge");
						System.out.println("Como voce deseja imprimir?"+
											"\n 1)-Sem formatacao"+
											"\n 2)-Com um traco entre os numeros"+
											"\n 3)-Pulando Linhas ou"+
											"\n 4)-Nem imprime");
						respostaMerge=leia.nextInt();
						switch(respostaMerge){
							case(1)://Sem Formatacao
							//--Inicia o marcador de tempo
								Instant tempoMergeSF = Instant.now();
							//--Copia array para ordenar por Merge em ordem crescente
								int[] cemMergeCresceSF = new int[novo.length];
								cemMergeCresceSF = merge.crescente(novo);
								Instant tempoMergeSF1 = Instant.now();
								
							//--Copia array para ordenarr decrescente em Merge
								int[] cemMergeDecresSF = new int[novo.length];
								cemMergeDecresSF = merge.decrescente(novo);
								Instant tempoMergeSF2 = Instant.now();
								
							//--Imprime
								imprime.imprimeLimpo(cemMergeCresceSF);
								imprime.imprimeLimpo(cemMergeDecresSF);
								
								Duration tempoMergeSF3 = Duration.between(tempoMergeSF,tempoMergeSF1);
								Duration tempoMergeSF4 = Duration.between(tempoMergeSF1,tempoMergeSF2);
							//--Ultimo print
								System .out.println("\n\nLevou " + tempoMergeSF3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoMergeSF4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempoMergeSF3.getNano());
								resultado[r].setValorDecre(tempoMergeSF4.getNano());
							break;
							case(2)://Traco
							//--Inicia o marcador de tempo
								Instant tempoMergeT = Instant.now();
							//--Copia array para ordenar por Merge em ordem crescente
								int[] cemMergeCresceT = new int[novo.length];
								cemMergeCresceT = merge.crescente(novo);
								Instant tempoMergeT1 = Instant.now();
								
							//--Copia array para ordenarr decrescente em Merge
								int[] cemMergeDecresT = new int[novo.length];
								cemMergeDecresT = merge.decrescente(novo);
								Instant tempoMergeT2 = Instant.now();
								
							//--Imprime
								imprime.imprimeTraco(cemMergeCresceT);
								imprime.imprimeTraco(cemMergeDecresT);
								
								Duration tempoMergeT3 = Duration.between(tempoMergeT,tempoMergeT1);
								Duration tempoMergeT4 = Duration.between(tempoMergeT1,tempoMergeT2);
							//--Ultimo print
								System .out.println("\n\nLevou " + tempoMergeT3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoMergeT4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempoMergeT3.getNano());
								resultado[r].setValorDecre(tempoMergeT4.getNano());
							break;
							case(3)://Pula linha
							//--Inicia o marcador de tempo
								Instant tempoMergeP = Instant.now();
							//--Copia array para ordenar por Merge em ordem crescente
								int[] cemMergeCresceP = new int[novo.length];
								cemMergeCresceP = merge.crescente(novo);
								Instant tempoMergeP1 = Instant.now();
								
							//--Copia array para ordenarr decrescente em Merge
								int[] cemMergeDecresP = new int[novo.length];
								cemMergeDecresP = merge.decrescente(novo);
								Instant tempoMergeP2 = Instant.now();
								
							//--Imprime
								imprime.imprimePorLinha(cemMergeCresceP);
								imprime.imprimePorLinha(cemMergeDecresP);
								
								Duration tempoMergeP3 = Duration.between(tempoMergeP,tempoMergeP1);
								Duration tempoMergeP4 = Duration.between(tempoMergeP1,tempoMergeP2);
							//--Ultimo print
								System .out.println("\n\nLevou " + tempoMergeP3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoMergeP4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempoMergeP3.getNano());
								resultado[r].setValorDecre(tempoMergeP4.getNano());
							case(4)://Nem imprime
							//--Inicia o marcador de tempo
								Instant tempoMergeN = Instant.now();
							//--Copia array para ordenar por Merge em ordem crescente
								int[] cemMergeCresceN = new int[novo.length];
								cemMergeCresceN = merge.crescente(novo);
								Instant tempoMergeN1 = Instant.now();
								
							//--Copia array para ordenarr decrescente em Merge
								int[] cemMergeDecresN = new int[novo.length];
								cemMergeDecresN = merge.decrescente(novo);
								Instant tempoMergeN2 = Instant.now();
								
								Duration tempoMergeN3 = Duration.between(tempoMergeN,tempoMergeN1);
								Duration tempoMergeN4 = Duration.between(tempoMergeN1,tempoMergeN2);
							//--Ultimo print
								System .out.println("\n\nLevou " + tempoMergeN3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoMergeN4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempoMergeN3.getNano());
								resultado[r].setValorDecre(tempoMergeN4.getNano());
							break;
						}
					break;
					case(5): //Sort
					resultado[r].setNome("Quick Sort");
						System.out.println("Como voce deseja imprimir?"+
											"\n 1)-Sem formatacao"+
											"\n 2)-Com um traco entre os numeros"+
											"\n 3)-Pulando Linhas ou"+
											"\n 4)-Nem imprime");
						respostaSort=leia.nextInt();
						switch(respostaSort){
							case(1)://Limpo
							//--Inicia o marcador de tempo
								Instant tempoSortSF = Instant.now();
							//--Copia array para ordenar por Merge em ordem crescente
								int[] cemSortCresceSF = new int[novo.length];
								cemSortCresceSF = sort.sortCres(novo);
								Instant tempoSortSF1 = Instant.now();
								
							//--Copia array para ordenarr decrescente em Merge
								int[] cemSortDecresSF = new int[novo.length];
								cemSortDecresSF = sort.sortDec(novo);
								Instant tempoSortSF2 = Instant.now();
								
							//--Imprime
								imprime.imprimeLimpo(cemSortCresceSF);
								imprime.imprimeLimpo(cemSortDecresSF);
								
								Duration tempoSortSF3 = Duration.between(tempoSortSF,tempoSortSF1);
								Duration tempoSortSF4 = Duration.between(tempoSortSF1,tempoSortSF2);
								//--Ultimo print
								System .out.println("\n\nLevou " + tempoSortSF3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoSortSF4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempoSortSF3.getNano());
								resultado[r].setValorDecre(tempoSortSF4.getNano());
							break;
							case(2)://Traco
							//--Inicia o marcador de tempo
								Instant tempoSortT = Instant.now();
							//--Copia array para ordenar por Sort em ordem crescente
								int[] cemSortCresceT = new int[novo.length];
								cemSortCresceT = sort.sortCres(novo);
								Instant tempoSortT1 = Instant.now();
								
							//--Copia array para ordenarr decrescente em Sort
								int[] cemSortDecresT = new int[novo.length];
								cemSortDecresT = sort.sortDec(novo);
								Instant tempoSortT2 = Instant.now();
								
							//--Imprime
								imprime.imprimeTraco(cemSortCresceT);
								imprime.imprimeTraco(cemSortDecresT);
								
								Duration tempoSortT3 = Duration.between(tempoSortT,tempoSortT1);
								Duration tempoSortT4 = Duration.between(tempoSortT1,tempoSortT2);
							//--Ultimo print
								System .out.println("\n\nLevou " + tempoSortT3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoSortT4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempoSortT3.getNano());
								resultado[r].setValorDecre(tempoSortT4.getNano());
							break;
							case(3)://Pula Linha
							//--Inicia o marcador de tempo
								Instant tempoSortP = Instant.now();
							//--Copia array para ordenar por Merge em ordem crescente
								int[] cemSortCresceP = new int[novo.length];
								cemSortCresceP = sort.sortCres(novo);
								Instant tempoSortP1 = Instant.now();
								
							//--Copia array para ordenarr decrescente em Merge
								int[] cemSortDecresP = new int[novo.length];
								cemSortDecresP = sort.sortDec(novo);
								Instant tempoSortP2 = Instant.now();
								
							//--Imprime
								imprime.imprimePorLinha(cemSortCresceP);
								imprime.imprimePorLinha(cemSortDecresP);
								
								Duration tempoSortP3 = Duration.between(tempoSortP,tempoSortP1);
								Duration tempoSortP4 = Duration.between(tempoSortP1,tempoSortP2);
							//--Ultimo print
								System .out.println("\n\nLevou " + tempoSortP3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoSortP4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempoSortP3.getNano());
								resultado[r].setValorDecre(tempoSortP4.getNano());
							break;
							case(4)://Nem imprime
							//--Inicia o marcador de tempo
								Instant tempoSortN = Instant.now();
							//--Copia array para ordenar por Merge em ordem crescente
								int[] cemSortCresceN = new int[novo.length];
								cemSortCresceN = sort.sortCres(novo);
								Instant tempoSortN1 = Instant.now();
								
							//--Copia array para ordenarr decrescente em Merge
								int[] cemSortDecresN = new int[novo.length];
								cemSortDecresN = sort.sortDec(novo);
								Instant tempoSortN2 = Instant.now();
								
								Duration tempoSortN3 = Duration.between(tempoSortN,tempoSortN1);
								Duration tempoSortN4 = Duration.between(tempoSortN1,tempoSortN2);
							//--Ultimo print
								System .out.println("\n\nLevou " + tempoSortN3.getNano() + " nanoseconds para ordenar crescente");
								System .out.println("\n\nLevou " + tempoSortN4.getNano() + " nanoseconds para ordenar decrescente");
								resultado[r].setValorCres(tempoSortN3.getNano());
								resultado[r].setValorDecre(tempoSortN4.getNano());
							break;
						}
					break;
					case(6): //Array
					resultado[r].setNome("Array");
						System.out.println("Como voce deseja imprimir?"+
											"\n 1)-Sem formatacao"+
											"\n 2)-Com um traco entre os numeros"+
											"\n 3)-Pulando Linhas ou"+
											"\n 4)-Nem imprime");
						respostaArrayS=leia.nextInt();
						switch(respostaArrayS){
						case(1)://Sem formatacao
						//--Inicia o marcador de tempo
							Instant tempoArraySF = Instant.now();
						//--Copia array para ordenar por Merge em ordem crescente
							int[] cemArraySCresceSF = new int[novo.length];
							cemArraySCresceSF = arrayS.arraySOrdenCresc(novo);
							Instant tempoArraySF1 = Instant.now();
							
						//--Copia array para ordenarr decrescente em Merge
							int[] cemArraySDecresSF = new int[novo.length];
							cemArraySDecresSF = arrayS.arraySOrdenDecr(novo);
							Instant tempoArraySF2 = Instant.now();
							
						//--Imprime
							imprime.imprimeLimpo(cemArraySCresceSF);
							imprime.imprimeLimpo(cemArraySDecresSF);
							
							Duration tempoArraySF3 = Duration.between(tempoArraySF,tempoArraySF1);
							Duration tempoArraySF4 = Duration.between(tempoArraySF1,tempoArraySF2);
						//--Ultimo print
							System .out.println("\n\nLevou " + tempoArraySF3.getNano() + " nanoseconds para ordenar crescente");
							System .out.println("\n\nLevou " + tempoArraySF4.getNano() + " nanoseconds para ordenar decrescente");
							resultado[r].setValorCres(tempoArraySF3.getNano());
							resultado[r].setValorDecre(tempoArraySF4.getNano());
						break;
						case(2)://Traco
						//--Inicia o marcador de tempo
							Instant tempoArrayT = Instant.now();
						//--Copia array para ordenar por em ordem crescente
							int[] cemArraySCresceT = new int[novo.length];
							cemArraySCresceT = arrayS.arraySOrdenCresc(novo);
							Instant tempoArrayT1 = Instant.now();
							
						//--Copia array para ordenar decrescente
							int[] cemArraySDecresT = new int[novo.length];
							cemArraySDecresT = arrayS.arraySOrdenDecr(novo);
							Instant tempoArrayT2 = Instant.now();
						
						//--Imprime
							imprime.imprimeTraco(cemArraySCresceT);
							imprime.imprimeTraco(cemArraySDecresT);
							
							Duration tempoArrayT3 = Duration.between(tempoArrayT,tempoArrayT1);
							Duration tempoArrayT4 = Duration.between(tempoArrayT1,tempoArrayT2);
						//--Ultimo print
							System .out.println("\n\nLevou " + tempoArrayT3.getNano() + " nanoseconds para ordenar crescente");
							System .out.println("\n\nLevou " + tempoArrayT4.getNano() + " nanoseconds para ordenar decrescente");
							resultado[r].setValorCres(tempoArrayT3.getNano());
							resultado[r].setValorDecre(tempoArrayT4.getNano());
						break;
						case(3)://Pula linha
						//--Inicia o marcador de tempo
							Instant tempoArrayP = Instant.now();
						//--Copia array para ordenar por Merge em ordem crescente
							int[] cemArraySCresceP = new int[novo.length];
							cemArraySCresceP = arrayS.arraySOrdenCresc(novo);
							Instant tempoArrayP1 = Instant.now();
							
						//--Copia array para ordenarr decrescente em Merge
							int[] cemArraySDecresP = new int[novo.length];
							cemArraySDecresP = arrayS.arraySOrdenDecr(novo);
							Instant tempoArrayP2 = Instant.now();
							
						//--Imprime
							imprime.imprimePorLinha(cemArraySCresceP);
							imprime.imprimePorLinha(cemArraySDecresP);
							
							Duration tempoArrayP3 = Duration.between(tempoArrayP,tempoArrayP1);
							Duration tempoArrayP4 = Duration.between(tempoArrayP1,tempoArrayP2);
						//--Ultimo print
							System .out.println("\n\nLevou " + tempoArrayP3.getNano() + " nanoseconds para ordenar crescente");
							System .out.println("\n\nLevou " + tempoArrayP4.getNano() + " nanoseconds para ordenar decrescente");
							resultado[r].setValorCres(tempoArrayP3.getNano());
							resultado[r].setValorDecre(tempoArrayP4.getNano());
						break;
						case(4)://Nem imprime
						//--Inicia o marcador de tempo
							Instant tempoArrayN = Instant.now();
						//--Copia array para ordenar por Merge em ordem crescente
							int[] cemArraySCresceN = new int[novo.length];
							cemArraySCresceN = arrayS.arraySOrdenCresc(novo);
							Instant tempoArrayN1 = Instant.now();
							
						//--Copia array para ordenarr decrescente em Merge
							int[] cemArraySDecresN = new int[novo.length];
							cemArraySDecresN = arrayS.arraySOrdenDecr(novo);
							Instant tempoArrayN2 = Instant.now();
							
							Duration tempoArrayN3 = Duration.between(tempoArrayN,tempoArrayN1);
							Duration tempoArrayN4 = Duration.between(tempoArrayN1,tempoArrayN2);
						//--Ultimo print
							System .out.println("\n\nLevou " + tempoArrayN3.getNano() + " nanoseconds para ordenar crescente");
							System .out.println("\n\nLevou " + tempoArrayN4.getNano() + " nanoseconds para ordenar decrescente");
							resultado[r].setValorCres(tempoArrayN3.getNano());
							resultado[r].setValorDecre(tempoArrayN4.getNano());
						break;
						}
					break;
					case(7)://Refatora as arrays
						System.out.println("Como voce deseja que o novo array seja?"+
											"\n 1)-Ordena a array emcrescente"+
											"\n 2)-Ordena a array em decrescente"+
											"\n 3)-Nova array desordenada"+
											"\n 4)-Nova array ordenada crescente"+
											"\n 5)-Nova array ordenada decrescente");
						respostaArrayN=leia.nextInt();
						switch(respostaArrayN){
							case(1):
								novo = arrayS.arraySOrdenCresc(novo);
								System.out.println("Fora de ordem:\n");
								imprime.imprimeTraco(novo);
							break;
							case(2):
								novo = arrayS.arraySOrdenDecr(novo);
								System.out.println("Ordenada decrescente:\n");
								imprime.imprimeTraco(novo);
							break;
							case(3):
								novo = arrais(tamanho);
								System.out.println("Fora de ordem:\n");
								imprime.imprimeTraco(novo);
							break;
							case(4):
								novo = arrayS.arraySOrdenCresc(arrais(tamanho));
								System.out.println("Ordenada crescente:\n");
								imprime.imprimeTraco(novo);
							
							break;
							case(5):
								novo = arrayS.arraySOrdenDecr(arrais(tamanho));
								System.out.println("Ordenada decrescente:\n");
								imprime.imprimeTraco(novo);
							break;
							}
					break;
				}
			
			//Gera relatorio
			
			
			if(r!=0){
				System.out.print("\n\n\n****************************************************");
				for(int i=0;i<=r;i++){
					System.out.println("\n*     Usando o "+ resultado[i].getNome() + " os tempos foram" +
										"\n*    Para ordenar crescente   => " + resultado[i].getValorCres() +
										"\n*    Para ordenar decrescente => " +resultado[i].getValorDecre());
					
					if(rapidoa>resultado[i].getValorCres()){
						rapidoa=resultado[i].getValorCres();
						veloza=resultado[i].getNome();
					}
						
					if(rapidob>resultado[i].getValorDecre()){
						rapidob=resultado[i].getValorDecre();
						velozb=resultado[i].getNome();
					}
				
				System.out.print("\n*************************************************");
				}			
				System.out.print("\n\n\n***************************************************************");
				System.out.print("\n*   O metodo " + veloza + " foi o mais veloz para ordenar crescente.");
				System.out.print("\n*   O metodo " + velozb + " foi o mais veloz para ordenar decrescente.");
				System.out.print("\n***************************************************************");
			}
			
			r++;
			Instant comeca1 = Instant.now();
			Duration duractionSelect1 = Duration.between(comeca,comeca1);
			System .out.println("\n\nVoce usou o programa por " + duractionSelect1.toMillis() + " ms para se divertir!!"  );	
			
			System.out.println("Voce deseja refazer o teste?");
			resposta1=leiaString.nextLine().toUpperCase();
		}
	}
	
	static int[] arrais(int tamanho){
		//Cria as arrays
			Cria cria = new Cria();
		
		//Cria as array desordenadas
			int[] retorno = cria.constroe(tamanho);
			
		return retorno;
	}
}

