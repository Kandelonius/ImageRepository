package com.kandel.imagerepo.bucket;

public enum BucketName {

    PROFILE_IMAGE("kandel-image-bucket-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
