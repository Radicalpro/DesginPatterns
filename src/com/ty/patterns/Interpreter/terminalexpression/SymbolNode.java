package com.ty.patterns.Interpreter.terminalexpression;

import com.ty.patterns.Interpreter.abstractexpression.Node;

public abstract class SymbolNode implements Node {

    protected Node left;
    protected Node right;

    public SymbolNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

}
