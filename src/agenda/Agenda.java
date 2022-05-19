package agenda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Agenda {
	List<Persona> agenda;
	Stream<Persona> personas = agenda.stream();
	public Agenda(List<Persona> p) {
		agenda = p;
	}
	public boolean algunoEmpiezanCon(String inicio){
		return personas.anyMatch(p -> (p.primeraLetra().equals(inicio)));
	}
	public List<Persona> nombresQueEmpiezanCon(String inicio){
		return personas.filter(p -> (p.primeraLetra().equals(inicio))).collect(Collectors.toList());
	}
	public List<String> nombresParaImprimir(){
		return personas.map(p -> p.getNombre()).collect(Collectors.toList());
	}
	public int sumaDeEdades() {
		return personas.mapToInt(p -> p.getEdad()).sum();
	}
	public Stream<Persona> ordenar(){
		return personas.sorted();
	}
}
