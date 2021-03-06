/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2015, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package org.mobicents.smsc.tools.smppsimulator;

import com.cloudhopper.smpp.SmppBindType;
import com.cloudhopper.smpp.SmppSession;

/**
 * 
 * @author sergey vetyutnev
 * 
 */
public class SmppSimulatorParameters {

    private int windowSize = 1;
    private SmppBindType bindType = SmppBindType.TRANSCEIVER;
    private String host = "127.0.0.1";
    private int port = 2776;
    private long connectTimeout = 10000;
    private String systemId = "test";
    private String password = "test";
    private long requestExpiryTimeout = 30000;
    private long windowMonitorInterval = 15000;

    private boolean rejectIncomingDeliveryMessage = false;

    private TON sourceTon = TON.International;
    private NPI sourceNpi = NPI.ISDN;
    private TON destTon = TON.International;
    private NPI destNpi = NPI.ISDN;
    private String sourceAddress = "6666";
    private String destAddress = "5555";
    private String addressRange = "6666";

    private String messageText = "Hello!";
    private EncodingType encodingType = EncodingType.GSM7;
    private boolean messageClass;
    private SplittingType splittingType = SplittingType.DoNotSplit;
    private ValidityType validityType = ValidityType.NoSpecial;
    private MCDeliveryReceipt mcDeliveryReceipt = MCDeliveryReceipt.No;
    private SendingMessageType sendingMessageType = SendingMessageType.SubmitSm;
    private int submitMultiMessageCnt = 2;
    private SmppSession.Type smppSessionType = SmppSession.Type.CLIENT;
    private int smppEncoding = 0;
    private MessagingMode messagingMode = MessagingMode.datagramm;

    private int bulkDestAddressRangeStart = 500000;
    private int bulkDestAddressRangeEnd = 600000;
    private int bulkMessagePerSecond = 10;

	public int getWindowSize() {
		return windowSize;
	}

	public void setWindowSize(int val) {
		windowSize = val;
	}

	public SmppBindType getBindType() {
		return bindType;
	}

	public void setBindType(SmppBindType val) {
		bindType = val;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String val) {
		host = val;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int val) {
		port = val;
	}

    public void setConnectTimeout(long value) {
        this.connectTimeout = value;
    }

    public long getConnectTimeout() {
        return this.connectTimeout;
    }

    public void setSystemId(String value) {
        this.systemId = value;
    }

    public String getSystemId() {
        return this.systemId;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    public String getPassword() {
        return this.password;
    }

    public long getRequestExpiryTimeout() {
        return requestExpiryTimeout;
    }

    /**
     * Set the amount of time to wait for an endpoint to respond to
     * a request before it expires. Defaults to disabled (-1).
     * @param requestExpiryTimeout  The amount of time to wait (in ms) before
     *      an unacknowledged request expires.  -1 disables.
     */
    public void setRequestExpiryTimeout(long requestExpiryTimeout) {
        this.requestExpiryTimeout = requestExpiryTimeout;
    }

    public long getWindowMonitorInterval() {
        return windowMonitorInterval;
    }

    /**
     * Sets the amount of time between executions of monitoring the window
     * for requests that expire.  It's recommended that this generally either
     * matches or is half the value of requestExpiryTimeout.  Therefore, at worst
     * a request would could take up 1.5X the requestExpiryTimeout to clear out.
     * @param windowMonitorInterval The amount of time to wait (in ms) between
     *      executions of monitoring the window.
     */
    public void setWindowMonitorInterval(long windowMonitorInterval) {
        this.windowMonitorInterval = windowMonitorInterval;
    }


    public TON getSourceTON() {
        return this.sourceTon;
    }

    public void setSourceTON(TON value) {
        this.sourceTon = value;
    }

    public NPI getSourceNPI() {
        return this.sourceNpi;
    }

    public void setSourceNPI(NPI value) {
        this.sourceNpi = value;
    }

    public TON getDestTON() {
        return this.destTon;
    }

    public void setDestTON(TON value) {
        this.destTon = value;
    }

    public NPI getDestNPI() {
        return this.destNpi;
    }

    public void setDestNPI(NPI value) {
        this.destNpi = value;
    }

    public String getSourceAddress() {
        return this.sourceAddress;
    }

    public void setSourceAddress(String value) {
        this.sourceAddress = value;
    }

    public String getAddressRange() {
        return this.addressRange;
    }

    public void setAddressRange(String value) {
        this.addressRange = value;
    }

    public String getDestAddress() {
        return this.destAddress;
    }

    public void setDestAddress(String value) {
        this.destAddress = value;
    }


	public String getMessageText() {
        return this.messageText;
    }

    public void setMessageText(String value) {
        this.messageText = value;
    }

	public EncodingType getEncodingType() {
		return encodingType;
	}

	public void setEncodingType(EncodingType val) {
		encodingType = val;
	}

	public SplittingType getSplittingType() {
		return splittingType;
	}

	public void setSplittingType(SplittingType val) {
		splittingType = val;
	}

	public ValidityType getValidityType() {
		return validityType;
	}

	public void setValidityType(ValidityType validityType) {
		this.validityType = validityType;
	}


	public boolean isRejectIncomingDeliveryMessage() {
		return rejectIncomingDeliveryMessage;
	}

	public void setRejectIncomingDeliveryMessage(boolean rejectIncomingDeliveryMessage) {
		this.rejectIncomingDeliveryMessage = rejectIncomingDeliveryMessage;
	}

	public int getBulkDestAddressRangeStart() {
		return bulkDestAddressRangeStart;
	}

	public void setBulkDestAddressRangeStart(int bulkDestAddressRangeStart) {
		this.bulkDestAddressRangeStart = bulkDestAddressRangeStart;
	}

	public int getBulkDestAddressRangeEnd() {
		return bulkDestAddressRangeEnd;
	}

	public void setBulkDestAddressRangeEnd(int bulkDestAddressRangeEnd) {
		this.bulkDestAddressRangeEnd = bulkDestAddressRangeEnd;
	}

	public int getBulkMessagePerSecond() {
		return bulkMessagePerSecond;
	}

	public void setBulkMessagePerSecond(int bulkMessagePerSecond) {
		this.bulkMessagePerSecond = bulkMessagePerSecond;
	}

    public boolean isMessageClass() {
        return messageClass;
    }

    public void setMessageClass(boolean messageClass) {
        this.messageClass = messageClass;
    }

    public MCDeliveryReceipt getMcDeliveryReceipt() {
        return mcDeliveryReceipt;
    }

    public void setMcDeliveryReceipt(MCDeliveryReceipt msDeliveryReceipt) {
        this.mcDeliveryReceipt = msDeliveryReceipt;
    }

    public SendingMessageType getSendingMessageType() {
        return sendingMessageType;
    }

    public void setSendingMessageType(SendingMessageType sendingMessageType) {
        this.sendingMessageType = sendingMessageType;
    }

    public int getSubmitMultiMessageCnt() {
        return submitMultiMessageCnt;
    }

    public void setSubmitMultiMessageCnt(int submitMultiMessageCnt) {
        this.submitMultiMessageCnt = submitMultiMessageCnt;
    }

    public SmppSession.Type getSmppSessionType() {
        return smppSessionType;
    }

    public void setSmppSessionType(SmppSession.Type smppSessionType) {
        this.smppSessionType = smppSessionType;
    }

    public int getSmppEncoding() {
        return smppEncoding;
    }

    public void setSmppEncoding(int smppEncoding) {
        this.smppEncoding = smppEncoding;
    }

    public MessagingMode getMessagingMode() {
        return messagingMode;
    }

    public void setMessagingMode(MessagingMode messagingMode) {
        this.messagingMode = messagingMode;
    }


    public enum EncodingType {
    	GSM7, GSM8, UCS2,
    }

    public enum SplittingType {
    	DoNotSplit, SplitWithParameters, SplitWithUdh,
    }

    public enum TON {
		Unknown(0), International(1), National(2), Network_Specific(3), Subscriber_Number(4), Alfanumeric(5), Abbreviated(6);

		private int code;

		private TON(int val) {
			this.code = val;
		}

		public int getCode() {
			return this.code;
		}
    }

    public enum NPI {
		Unknown(0), ISDN(1), Data(3), Telex(4), Land_Mobile(6), National(8), Private(9), ERMES(10), Internet_IP(14), WAP_Client_Id(18);

		private int code;

		private NPI(int val) {
			this.code = val;
		}

		public int getCode() {
			return this.code;
		}
    }

    public enum ValidityType {
		NoSpecial, ValidityPeriod_5min, ValidityPeriod_2hours, ScheduleDeliveryTime_5min;
    }

    public enum MCDeliveryReceipt {
        No(0), onSuccessOrFailure(1), onFailure(2), onSuccess(3);

        private int code;

        private MCDeliveryReceipt(int val) {
            this.code = val;
        }

        public int getCode() {
            return this.code;
        }
    }

    public enum SendingMessageType {
        SubmitSm, DataSm, DeliverSm;
    }

    public enum MessagingMode {
        defaultSmscMode(0), datagramm(1), transaction(2), storeAndForward(3);

        private int code;

        private MessagingMode(int val) {
            this.code = val;
        }

        public int getCode() {
            return this.code;
        }
    }
}

