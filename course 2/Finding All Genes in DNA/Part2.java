/**
 * Write a description of Part2 here.
 * 
 * @author (Ali F. Abid) 
 * @version (October 07 2018)
 */
public class Part2 {
	public String findGeneSimple(String dna, String startCodon, String stopCodon){
        String result = "";
        if(Character.isUpperCase(dna.charAt(0))) {
            startCodon = startCodon.toUpperCase();
            stopCodon = stopCodon.toUpperCase();
        } else {
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
        }
        
        int startIndex = dna.indexOf(startCodon);
        if(startIndex == -1){
            return "";
        }
        int stopIndex = dna.indexOf(stopCodon, startIndex);
        if(stopIndex == -1){
            return "";
        }
        if((stopIndex - startIndex) % 3 == 0) {
        result = dna.substring(startIndex, stopIndex+3);
        return result;    
        } 
        else
            {
            return "";
        }
        
    }

    public void testFindGeneSimple(){
        String a  = "CCATCAATAACATGA";
        System.out.println("DNA strand is: " + a);
        System.out.println("The gene is: " + findGeneSimple(a, "ATG", "TAA"));
        
        String b = "CCAATGCAGCGATAC";
        System.out.println("DNA strand is: " + b);
        System.out.println("The gene is: " + findGeneSimple(b, "ATG", "TAA"));
        String c = "CTAATCCGGATCCGA";
        System.out.println("DNA strand is: " + c);
        System.out.println("The gene is: " + findGeneSimple(c, "ATG", "TAA"));
        
        
    }
    public static void main (String[] args){
        Part2 gene = new Part2();
        gene.testFindGeneSimple();
}
}