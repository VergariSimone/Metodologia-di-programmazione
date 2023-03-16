public class Menu {
    
    // attributi 
    public static final String labels = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public String menuText;
    public int optionCount;

    //costruttore 
    public Menu(){
        menuText = "";
        optionCount = 0;

    }

    //metodi

    /*
     * stampa il contenuto testuale del menù
     */
    public String display(){

        return menuText;

    }


    /*
     * aggiunge una voce al menù.La lettera identificativa della nuova 
     * voce sarà quella in posizione optionLabel. Una volta ottenuta,
     *  l’aggiunta della voce al testo corrente, rappresentato 
     * dall’attributo menuText, dovrà essere fatta secondo 
     * il seguente schema: {menuText}
     * {LetteraDellaNuovaVoce}) {opzione}
     * Ai fini di esempio viene fornita un’esecuzione di questa 
     * chiamata:
     * addOption(“pippo”): LetteraDellaNuovaVoce = “C”
     * menuText = 
     * “A) Voce Uno
     * B) Voce Due
     * C) pippo”
     */

     public void addOption(String option){
        String optionLabel = labels.substring(optionCount,optionCount + 1);
        optionCount = optionCount + 1;
        menuText = menuText + optionLabel + ") " + option + "\n";
     }
}

