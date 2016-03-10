package net.java.otr4j.crypto;

import net.java.otr4j.OtrException;
import net.java.otr4j.session.TLV;

public interface OtrTlvHandler
{
    /**
     * process an incoming TLV and optionally return an array of TLVs to send
     * back
     */
    void processTlv(TLV tlv) throws OtrException;
}
