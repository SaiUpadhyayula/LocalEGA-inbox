package se.nbis.lega.inbox.pojo;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.ToString;

/**
 * Nested POJO for MQ message to publish.
 */
@ToString
@Data
public class EncryptedIntegrity {

    @SerializedName("checksum")
    private final String checksum;

    @SerializedName("algorithm")
    private final String algorithm;

}
