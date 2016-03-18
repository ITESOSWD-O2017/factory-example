package com.iteso.factory;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class PozoleStore {
    public Pozole orderPozole(String meat){
        Pozole pozole;

        pozole = createPozoleFactory(meat);

        pozole.prepare();
        pozole.serve();

        return pozole;
    }

    protected abstract Pozole createPozoleFactory(String meat);
}
