 import java.util.Arrays;

public class ArrayOfSeries{
    public static void main(String[] args){
        // Создайте обьект любимого вами сериала - напр
        Series my_favourite_show = new Series("comedy", "TBBT", 5); 
        //!!! ВНИМАНИЕ - как вы видите конструткор сериала получает на 5-ом месте
        //    кол-во сезонов! 

        // добавляем 2 сезона
        my_favourite_show.setSeason(0, new Season("Season 1 name",3) );
        my_favourite_show.setSeason(1, new Season("Season 2 name",3) );
        // тут мы добавляем новый обьект в массив "seasons" внутрь сериала на индекс 0
        // это равносильно первому сезону
        //!!! ВНИМАНИЕ второй аргумент конструктора Season(...,3) это кол-во серий

        // добавим пару серий в первый сезон
        my_favourite_show.getSeason(0).setEpisode( 0, new Episode("Episode 1 name"), 45 );
        // 45 - минут

        // допишите логику классов и добавления 1-2 сезонов
        // после этого, при выполнении след. строки кода
        System.out.println( my_favourite_show );
        // сработает "toString()" и вы должны увидеть результат который описан ниже в формулах
        // этого метода

        // под конец пользуясь методом "getDuration()"
        if( my_favourite_show.getSeason(0).getDuration() > my_favourite_show.getSeason(1).getDuration() ){
            System.out.println( "Season 1 is longer" );
        }else{
            System.out.println( "Season 2 is longer" );
        }
    }
}

// предположим у нас есть класс "сериал"
class Series {
	private int season_number;
    private String category;          // название категории сериала
    private String name;              // Название                     - Ме меньше 2 символов
    private Season[] seasons;// массив с сезонами этого сериала, на индексе 0 - находится сезон 1
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

	
    
    // добавить конструктор + сеттеры / геттеры
    // добавить правила для проверки (используя String.length() / if/else)
    // добавить "setSeason(Integer index, Season season)" который установит обьект
    // сезона в указанную ячейку массива, и добавит обратную связь сезона с сериалом
    // добавить toString() он должен возвращать строку в таком формате
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
// класс "сезон"
class Season {
	private int duration;
	private  int episode_number;
    private Series series;          // обратная ссылка на обьект сериала
    private String name;            // Название                     - Ме меньше 2 символов
    private Episode[] episodes;// массив с сериями этого сезона, на индексе 0 - находится серия 1
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
	 
	
	
    
    // добавить конструктор + сеттеры / геттеры
    // добавить правила для проверки (используя String.length() / if/else)
    // добавить "setEpisode(Integer index, Episode episode)" который установит обьект
    // серии в указанную ячейку массива, и добавит обратную связь серии с сезоном
    // в обьекте сезон есть метод "getDuration()" который вернет продолжительность всего сезона
    // в минутах (т е - суму продолжительности всех серий)
    // добавить toString() он должен возвращать строку в таком формате
    // > "Season name"
    // > 1. "Episode 1 Title"    [00:45]
    // > 2. "Episode 2 Title"    [00:40]
    // > 3. "Episode 3 Title"    [00:45]
    //   ....
}

// класс "серия"
class Episode {
    private Season season;          // обратная ссылка на обьект сезона
    private String name;            // Название                     - Ме меньше 2 символов
    private Integer duration;       // продолжительность в минутах! - от 15 до 100 минут
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
	
    
    
    // добавить конструктор + сеттеры / геттеры
    // добавить правила для проверки (используя String.length() / if/else)
    // добавить toString() он должен возвращать строку в таком формате
    // > "Episode Title"    [00:45]

