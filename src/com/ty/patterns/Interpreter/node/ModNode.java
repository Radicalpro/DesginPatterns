package com.ty.patterns.Interpreter.node;

import com.ty.patterns.Interpreter.Node;
import com.ty.patterns.Interpreter.SymbolNode;

public class ModNode extends SymbolNode {

    public ModNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return super.left.interpret() % super.right.interpret();
    }

}
