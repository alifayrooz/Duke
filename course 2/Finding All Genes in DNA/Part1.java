/**
 * Write a description of Part1 here.
 * 
 * @author (Ali F. Abid) 
 * @version (October 07 2018)
 */
public class Part1 {
	public String findGeneSimple(String dna){
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if(startIndex == -1){
            return "";
        }
        int stopIndex = dna.indexOf("TAA", startIndex+3);
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
        String a  = "AATGCGTAATATGGT";
        System.out.println("DNA strand is: " + a);
        System.out.println("The gene is: " + findGeneSimple(a));
        
        String b = "TAACGTTA";
        System.out.println("DNA strand is: " + b);
        System.out.println("The gene is: " + findGeneSimple(b));
        String c = "CCAGCATGCCAGTCAGCTAACAG";
        System.out.println("DNA strand is: " + c);
        System.out.println("The gene is: " + findGeneSimple(c));
        
        
    }
    public static void main (String[] args){
        Part1 gene = new Part1();
        gene.testFindGeneSimple();
}
}