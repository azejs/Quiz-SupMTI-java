/*
 Ce code Java définit une classe Item qui représente un élément (objet) d'un quiz.
 */
package Quiz;

/**
La classe contient 7 attributs privés 
 */
public class Item {
    /**
    _num : qui représente le numéro de l'élément
    _ques : qui représente la question de l'élément
     _a, _b, _c, _d : qui représentent les 4 options de réponse possibles à la question
     */
    private String _num;
    private String _ques;
    private String _a;
    private String _b;
    private String _c;
    private String _d;
    
    /**Le constructeur de la classe prend en entrée les 6 paramètres 
    nécessaires pour initialiser les 6 attributs de l'élément.
      */      
    public Item(String NUM, String QUES, String A, String B, String C, String D) {
        this._num = NUM;
        this._ques = QUES;
        this._a = A;
        this._b = B;
        this._c = C;
        this._d = D;
    }   
        
    /*La classe a également des méthodes get pour récupérer les valeurs de
    chaque attribut, qui sont des méthodes publiques de la classe Item.
    */
    public String getNum()
    {
        return _num;
    }
    
    public String getQues()
    {
        return _ques;
    }
    
    public String getA()
    {
        return _a;
    }
    
    public String getB()
    {
        return _b;
    }
    
    public String getC()
    {
        return _c;
    }
    
    public String getD()
    {
        return _d;
    }
    
        
        
}
    
