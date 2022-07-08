/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

/**
 *
 * @author hahahahah
 */
public class Item {
    
    private String _num;
    private String _ques;
    private String _a;
    private String _b;
    private String _c;
    private String _d;
    
    public Item(String NUM, String QUES, String A, String B, String C, String D) {
        this._num = NUM;
        this._ques = QUES;
        this._a = A;
        this._b = B;
        this._c = C;
        this._d = D;
    }   
        
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
    
