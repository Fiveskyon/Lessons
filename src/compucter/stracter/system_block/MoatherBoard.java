package compucter.stracter.system_block;

import compucter.stracter.system_block.moather_board.OperRam;
import compucter.stracter.system_block.moather_board.Processor;

import java.util.Arrays;

public class MoatherBoard {
    private String name;
    private String model;
    private OperRam[] ozu;
    private Processor processor;

   private  VideoCard integrationVideo;

    private String radiator;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public OperRam[] getOzu() {
        return ozu;
    }

    public void setOzu(OperRam[] ozu) {
        this.ozu = ozu;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public VideoCard getIntegrationVideo() {
        return integrationVideo;
    }

    public void setIntegrationVideo(VideoCard integrationVideo) {
        this.integrationVideo = integrationVideo;
    }

    public String getRadiator() {
        return radiator;
    }

    public void setRadiator(String radiator) {
        this.radiator = radiator;
    }

    @Override
    public String toString() {
        return "MoatherBoard{" +"\n" +
                "name='" + name + '\'' +"\n" +
                ", model='" + model + '\'' +"\n" +
                ", ozu=" + Arrays.toString ( ozu ) +"\n" +
                ", processor=" + processor +"\n" +
                ", integrationVideo=" + integrationVideo +"\n" +
                ", radiator='" + radiator + '\'' +"\n" +
                '}'+ "\n" ;
    }
}
