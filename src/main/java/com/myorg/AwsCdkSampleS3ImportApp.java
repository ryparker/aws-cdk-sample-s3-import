package com.myorg;

import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.StackProps;

public class AwsCdkSampleS3ImportApp {
    public static void main(final String[] args) {
        App app = new App();

        new AwsCdkSampleS3ImportStack(app, "AwsCdkSampleS3ImportStack", StackProps.builder()
                .build());

        app.synth();
    }
}
