/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codecampday2;

/**
 *
 * @author johnrayworth
 */
public class Node {                                                                //Pretty much a normal template class:

    private Object data;                                                           //Two attributes, though, yes, it's curious that one of them is an instance of the class itself...
    private Node nextPointer;                                                 //... but that's handy because the "pointers", as objects, can be used in the List class as the addresses they actually are.

    public Node(Object data) {                                                //The constructor.
        this.data = data;
        nextPointer = null;
    }

    public void setData(Object data) {                                     //A couple of "set" methods.
        this.data = data;
    }

    public void setNextPointer(Node nextPointer) {
        this.nextPointer = nextPointer;
    }

    public Object getData() {                                                    //And a couple of "get" methods.
        return data;
    }

    public Node getNextPointer() {
        return nextPointer;
    }

}
