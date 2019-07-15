import java.util.Arrays;

public class ArrayOfSeries{
    public static void main(String[] args){
        // �������� ������ �������� ���� ������� - ����
        Series my_favourite_show = new Series("comedy", "TBBT", 5); 
        //!!! �������� - ��� �� ������ ����������� ������� �������� �� 5-�� �����
        //    ���-�� �������! 

        // ��������� 2 ������
        my_favourite_show.setSeason(0, new Season("Season 1 name",3) );
        my_favourite_show.setSeason(1, new Season("Season 2 name",3) );
        // ��� �� ��������� ����� ������ � ������ "seasons" ������ ������� �� ������ 0
        // ��� ����������� ������� ������
        //!!! �������� ������ �������� ������������ Season(...,3) ��� ���-�� �����

        // ������� ���� ����� � ������ �����
        my_favourite_show.getSeason(0).setEpisode( 0, new Episode("Episode 1 name"), 45 );
        // 45 - �����

        // �������� ������ ������� � ���������� 1-2 �������
        // ����� �����, ��� ���������� ����. ������ ����
        System.out.println( my_favourite_show );
        // ��������� "toString()" � �� ������ ������� ��������� ������� ������ ���� � ��������
        // ����� ������

        // ��� ����� ��������� ������� "getDuration()"
        if( my_favourite_show.getSeason(0).getDuration() > my_favourite_show.getSeason(1).getDuration() ){
            System.out.println( "Season 1 is longer" );
        }else{
            System.out.println( "Season 2 is longer" );
        }
    }
}

// ����������� � ��� ���� ����� "������"
class Series {
	private int season_number;
    private String category;          // �������� ��������� �������
    private String name;              // ��������                     - �� ������ 2 ��������
    private Season[] seasons;// ������ � �������� ����� �������, �� ������� 0 - ��������� ����� 1
	public Series(String category, String name, Season[] seasons) {
	 
		this.category = category;
		if(name.length()<2){System.err.println("wrong format");}else{
		this.name = name;}
		this.seasons = seasons;
	
	}
	
	public Series(String category, String name, int season_number) {
		this.season_number=season_number;
		this.category = category;
		this.name = name;
	}
	

	public int getSeason_number() {
		return season_number;
	}

	public void setSeason_number(int season_number) {
		this.season_number = season_number;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
	
			this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()<2){System.err.println("wrong format");}else{
		this.name = name;}
	}
	public Season[] getSeasons() {
		return seasons;
	}
	
	public void setSeasons(Season[] seasons) {
		this.seasons = seasons;
	}
	public void setSeason(Integer index,Season seasons) {
		this.seasons[index] = seasons;
	}
	
	public Season getSeason(Integer index) {
		return this.seasons[index];
	}

	
    
    // �������� ����������� + ������� / �������
    // �������� ������� ��� �������� (��������� String.length() / if/else)
    // �������� "setSeason(Integer index, Season season)" ������� ��������� ������
    // ������ � ��������� ������ �������, � ������� �������� ����� ������ � ��������
    // �������� toString() �� ������ ���������� ������ � ����� �������
    // > "Series name"
    // > 1. "Season 1 name"
    // > 1. "Episode 1 Title"    [00:45]
    // > 2. "Episode 2 Title"    [00:40]
    // > 3. "Episode 3 Title"    [00:45]
    //   ....
    // > 2. "Season 2 name"
    // > 1. "Episode 1 Title"    [00:45]
    // > 2. "Episode 2 Title"    [00:40]
    // > 3. "Episode 3 Title"    [00:45]

}
// ����� "�����"
class Season {
	private int duration;
	private  int episode_number;
    private Series series;          // �������� ������ �� ������ �������
    private String name;            // ��������                     - �� ������ 2 ��������
    private Episode[] episodes;// ������ � ������� ����� ������, �� ������� 0 - ��������� ����� 1
    Episode episode; 
	public Season(Series series, String name, Episode[] episodes) {
		this.series = series;
		if(name.length()<2){System.err.println("wrong format");}else{
			this.name = name;}
		this.episodes = episodes;
	}
	 
	 


	public Season(  String name ,int episode_number) {
	this.episode_number = episode_number;
	if(name.length()<2){System.err.println("wrong format");}else{
		this.name = name;}
	}
	
    public int getEpisode_number() {
		return episode_number;
	}


	public void setEpisode_number(int episode_number) {
		this.episode_number = episode_number;
	}


	public Series getSeries() {
		return series;
	}
	public void setSeries(Series series) {
		this.series = series;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()<2){System.err.println("wrong format");}else{
			this.name = name;}
	}
	public Episode[] getEpisodes() {
		return episodes;
	}
	public void setEpisodes(Episode[] episodes) {
		this.episodes = episodes;
	}
	public void setEpisode(Integer index, Episode episode) {
		this.episodes[index] = episode;
	}

	public void setEpisode(Integer index, Episode episode, Integer duration) {
		this.episodes[index] = episode;
		 this.duration+=episode.getDuration();
		
	
	}
	public int getDuration(){
	 
		return this.duration;  }
		
    public void setDuration(){
    	this.duration+=episode.getDuration()* getEpisode_number();
		
		
	}
	@Override
	public String toString() {
		return getName()+"\n"+getName()+" "+getDuration();
	}
	 
	
	
    
    // �������� ����������� + ������� / �������
    // �������� ������� ��� �������� (��������� String.length() / if/else)
    // �������� "setEpisode(Integer index, Episode episode)" ������� ��������� ������
    // ����� � ��������� ������ �������, � ������� �������� ����� ����� � �������
    // � ������� ����� ���� ����� "getDuration()" ������� ������ ����������������� ����� ������
    // � ������� (� � - ���� ����������������� ���� �����)
    // �������� toString() �� ������ ���������� ������ � ����� �������
    // > "Season name"
    // > 1. "Episode 1 Title"    [00:45]
    // > 2. "Episode 2 Title"    [00:40]
    // > 3. "Episode 3 Title"    [00:45]
    //   ....
}

// ����� "�����"
class Episode {
    private Season season;          // �������� ������ �� ������ ������
    private String name;            // ��������                     - �� ������ 2 ��������
    private Integer duration;       // ����������������� � �������! - �� 15 �� 100 �����
	public Episode(Season season, String name, Integer duration) {
		this.season = season;
		if(name.length()<2){System.err.println("wrong format");}else{
			this.name = name;}
		this.duration = duration;
	}
	public Episode(String name) {
		if(name.length()<2){System.err.println("wrong format");}else{
			this.name = name;}
		
	}
	public Season getSeason() {
		return season;
	}
	public void setSeason(Season season) {
		this.season = season;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()<2){System.err.println("wrong format");}else{
			this.name = name;}
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		if(duration>100&&duration<15){System.err.println("wrong format");}else {
		this.duration = duration;}
	}
	@Override
	public String toString() {
		return getName()+" "+getDuration();
	}
	
    
    
    // �������� ����������� + ������� / �������
    // �������� ������� ��� �������� (��������� String.length() / if/else)
    // �������� toString() �� ������ ���������� ������ � ����� �������
    // > "Episode Title"    [00:45]

}