package compucter.stracter;

import compucter.stracter.system_block.Box;
import compucter.stracter.system_block.HardDisc;
import compucter.stracter.system_block.PowerBlock;
import compucter.stracter.system_block.VideoCard;
import compucter.stracter.system_block.moather_board.Processor;

import java.util.Arrays;

public class SystemBox {
    private Box box;
    private HardDisc[] dataRam;
    private PowerBlock powerUnit;

    private VideoCard[] videoCards;

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public HardDisc[] getDataRam() {
        return dataRam;
    }

    public void setDataRam(HardDisc[] dataRam) {
        this.dataRam = dataRam;
    }

    public PowerBlock getPowerUnit() {
        return powerUnit;
    }

    public void setPowerUnit(PowerBlock powerUnit) {
        this.powerUnit = powerUnit;
    }

    public VideoCard[] getVideoCards() {
        return videoCards;
    }

    public void setVideoCards(VideoCard[] videoCards) {
        this.videoCards = videoCards;
    }

    @Override
    public String toString() {
        return "SystemBox{" + "\n" +
                "box=" + box +"\n" +
                ", dataRam=" + Arrays.toString ( dataRam ) +"\n" +
                ", powerUnit=" + powerUnit +"\n" +
                ", videoCards=" + Arrays.toString ( videoCards ) +"\n" +
                '}' + "\n" ;
    }
}
