import { App, Stack, CfnOutput } from '@aws-cdk/core';
import { Bucket } from '@aws-cdk/aws-s3';

const app = new App();
const stack = new Stack(app, 'sample-s3-import');

const bucket = Bucket.fromBucketName(stack, "myBucket", "aws-athena-query-results-123456789-us-east-2")

new CfnOutput(stack, 'BucketName', { value: bucket.bucketName })
