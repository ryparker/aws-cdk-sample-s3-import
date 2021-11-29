package com.myorg;

import org.jetbrains.annotations.NotNull;

import software.amazon.awscdk.core.Construct;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;
import software.amazon.awscdk.core.CfnOutput;
import software.amazon.awscdk.services.s3.Bucket;
import software.amazon.awscdk.services.s3.IBucket;

public class AwsCdkSampleS3ImportStack extends Stack {
    public AwsCdkSampleS3ImportStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public AwsCdkSampleS3ImportStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        @NotNull IBucket bucket = Bucket.fromBucketName(this, "myBucket", "aws-athena-query-results-123456789-us-east-2");

        CfnOutput.Builder.create(this, "Bucket")
          .description("Bucket Name")
          .value(bucket.getBucketName())
          .build();
    }
}
