public class EthernetAdapter implements EthernetPort {

    USBPort usbPort;
    public EthernetAdapter(USBPort usbPort){
        this.usbPort = usbPort;
    }

    public void connectEthernetPort() {
        usbPort.connectUSBPort();
    }
}
