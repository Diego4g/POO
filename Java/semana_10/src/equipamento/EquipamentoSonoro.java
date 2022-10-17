package equipamento;

public class EquipamentoSonoro extends Equipamento {
  private short volume;
  private boolean stereo;
  
  public EquipamentoSonoro() {
  }

  public short getVolume() {
    return volume;
  }

  public void setVolume(short volume) {
    this.volume = volume;
  }

  public boolean isStereo() {
    return stereo;
  }

  public void setStereo(boolean stereo) {
    this.stereo = stereo;
  }

  public void mono() {
    stereo = false;
  }

  public void stereo() {
    stereo = true;
  }

  @Override
  public String toString() {
    return "EquipamentoSonoro [volume=" + volume + ", stereo=" + stereo + "]";
  }
  
}
