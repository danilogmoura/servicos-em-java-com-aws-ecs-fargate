package com.myorg;

import software.amazon.awscdk.core.App;

public class CursoAwsCdkApp {
    public static void main(final String[] args) {
        App app = new App();

        VpcStack vpcStack = new VpcStack(app, "Vpc");

        new ClusterStack(app, "Cluster", vpcStack.getVpc());

        app.synth();
    }
}
