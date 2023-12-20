package com.structural.adapterTest;

public interface DataOperation {
    String encrypt(String data);
}

// object adapter
class OperationAdapter implements DataOperation {
    private static final AlgoRepo algo = new AlgoRepo();

    @Override
    public String encrypt(String data) {
        return algo.encrypt(data);
    }
}
