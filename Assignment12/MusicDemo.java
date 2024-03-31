package Assignment12;
interface Playable
{
	void play();
	void pause();
	void stop();
}
class MP3Player implements Playable
{
	public void play()
	{
		System.out.println(" MP3Player play");
	}
	public void pause()
	{
		System.out.println(" MP3Player pause");
	}
	public void stop()
	{
		System.out.println(" MP3Player stop");
	}
}
class  CDPlayer implements Playable
{
	public void play()
	{
		System.out.println(" CDPlayer play");
	}
	public void pause()
	{
		System.out.println(" CDPlayer pause");
	}
	public void stop()
	{
		System.out.println("CDPlayer stop");
	}
}
class StreamingPlayer implements Playable
{
	public void play()
	{
		System.out.println(" StreamingPlayer play");
	}
	public void pause()
	{
		System.out.println(" StreamingPlayer pause");
	}
	public void stop()
	{
		System.out.println("StreamingPlayer stop");
	}
}
public class MusicDemo {

	public static void main(String[] args) {
		Playable play=new MP3Player();
		play.play();
		play.pause();
		play.stop();
		Playable play2=new CDPlayer();
		play2.play();
		play2.pause();
		play2.stop();
		Playable play3=new StreamingPlayer();
		play3.play();
		play3.pause();
		play3.stop();
	}
}
