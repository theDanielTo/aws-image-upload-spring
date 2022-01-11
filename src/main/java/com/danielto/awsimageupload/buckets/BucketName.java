package com.danielto.awsimageupload.buckets;

public enum BucketName {
    PROFILE_IMAGE("danielto-image-upload-1");

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    private final String bucketName;

    public String getBucketName() {
        return bucketName;
    }
}
