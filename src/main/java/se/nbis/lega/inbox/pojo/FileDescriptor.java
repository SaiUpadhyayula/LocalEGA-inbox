package se.nbis.lega.inbox.pojo;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class FileDescriptor {

    @SerializedName("user")
    private String user;

    @SerializedName("filepath")
    private String filePath;

    @SerializedName("content")
    private String content;

    @SerializedName("filesize")
    private long fileSize;

    @SerializedName("encrypted_integrity")
    private EncryptedIntegrity encryptedIntegrity;

}