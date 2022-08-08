import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pokedex {
	
	public Set<Pokemon> pokedex = new HashSet<Pokemon>();
	
	
	Pokemon mew = new Pokemon("Mew       ", 1, "Psiquico","Psiquico", "Diz-se que seu DNA contém os códigos genéticos de todos os Pokémon, então ele pode usar todos os tipos de técnicas.");
	Pokemon mewtwo = new Pokemon("Mewtwo    ", 2, "Psiquico", "Psiquico", "Foi criado por um cientista após anos de horríveis experimentos de splicing de genes e engenharia de DNA.");
	Pokemon articuno = new Pokemon("Articuno  ", 3, "Gelo    ", "Voador  ", "Um dos pássaros lendários, ele resfria a umidade da atmosfera para criar neve enquanto voa.");
	Pokemon zapdos = new Pokemon("Zapdos    ", 4, "Eletrico", "Voador  ", "Este pássaro lendário causa tempestades selvagens batendo suas asas brilhantes.");
	Pokemon moltres = new Pokemon("Moltres   ", 5, "Fogo    ", "Voador  ", "Este lendário Pokémon espalha brasas com cada batida de suas asas. É uma visão emocionante de se ver.");
	Pokemon hooh = new Pokemon("Ho-oh     ", 6, "Fogo    ", "Voador  ", "A legend says that its body glows in seven colors. A rainbow is said to form behind it when it flies.");
	Pokemon lugia = new Pokemon("Lugia     ", 7, "Psiquico", "Voador  ", "Ele dorme em uma trincheira no fundo do mar. Se bater as asas, diz-se que causa uma tempestade de 40 dias.");
	Pokemon suicune = new Pokemon("Suicune   ", 8, "Agua    ","Agua    ", "Encarna a compaixão de uma fonte de água pura. Ele atravessa a terra com graciosidade. Este POKéMON tem o poder de purificar a água suja.");
	Pokemon raikou = new Pokemon("Raikou    ", 9, "Eletrico", "Eletrico", "RAIKOU incorpora a velocidade do relâmpago. Os rugidos deste POKéMON enviam ondas de choque que estremecem o ar e sacodem o chão como se relâmpagos tivessem caído.");
	Pokemon entei = new Pokemon("Entei     ", 10, "Fogo    ", "Fogo    ", "Um POKéMON que corre pela terra. Diz-se que se nasce cada vez que surge um novo vulcão.");
	Pokemon groudon = new Pokemon("Groundon  ", 11, "Solo    ", "Solo    ", "Acredita-se que Groudon tenha expandido as terras por evaporação da água com calor furioso. Ele lutou titânicamente com Kyogre.");
	Pokemon kyogre = new Pokemon("Kyogre    ", 12, "Agua    ",  "Agua    ", "Um Pokémon mítico que  incha os mares com chuva e maremotos. Ele lutou com Groudon.");
	Pokemon rayquaza = new Pokemon("Rayquaza  ", 13, "Dragao  ", "Voador  ", "Um POKéMON que voa sem parar na camada de ozônio. Diz-se que desceria ao chão se KYOGRE e GROUDON lutassem.");
	
	
	
	public void addPokemons() {
		pokedex.add(mew);
		pokedex.add(mewtwo);
		pokedex.add(articuno);
		pokedex.add(zapdos);
		pokedex.add(moltres);
		pokedex.add(hooh);
		pokedex.add(lugia);
		pokedex.add(suicune);
		pokedex.add(raikou);
		pokedex.add(entei);
		pokedex.add(groudon);
		pokedex.add(kyogre);
		pokedex.add(rayquaza);
	}
	
	public void printPokedex() {
		System.out.println(pokedex);
	}
	
	
	
	
	
	
	
}
