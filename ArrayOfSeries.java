  java.util.Arrays;

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
    private String category;          // название категории сериала
    private String name;              // Название                     - Ме меньше 2 символов
    private Season[] seasons = new Season[3]; 
    private Integer seasons_number;// массив с сезонами этого сериала, на индексе 0 - находится сезон 1
    
	public Series(String category, String name, Integer seasons_number) {
		this.category = category;
		if(name.length()<2){System.out.println("Error");}else {
		this.name = name;}
		this.seasons_number = seasons_number;
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
		if(name.length()<2){System.out.println("Error");}else {
			this.name = name;}
	}

	public Integer getSeasons_number() {
		return seasons_number;
	}

	public void setSeasons_number(Integer seasons_number) {
		this.seasons_number = seasons_number;
	}
	public Season getSeason (Integer index) {
		return seasons[index];
	}
	
	public void setSeason (Integer index, Season season) {
		seasons[index]=season;
	}
	
	@Override
	public String toString() {
	return getName()
		   +"\n"+seasons[1].getName()
	       +"\n"+seasons[1].getEpisode(1)+"  "+"["+seasons[1].getEpisode(1).getDuration()+"]"
		   +"\n"+seasons[1].getEpisode(2)+"  "+"["+seasons[1].getEpisode(2).getDuration()+"]"
		   +"\n"+seasons[1].getEpisode(3)+"  "+"["+seasons[1].getEpisode(3).getDuration()+"]"
		   +"\n"+"..."
		   +"\n"+seasons[2].getEpisode(1)+"  "+"["+seasons[2].getEpisode(1).getDuration()+"]"
		   +"\n"+seasons[2].getEpisode(2)+"  "+"["+seasons[2].getEpisode(2).getDuration()+"]"
		   +"\n"+seasons[2].getEpisode(3)+"  "+"["+seasons[2].getEpisode(3).getDuration()+"]";
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
    private Series series;          // обратная ссылка на обьект сериала
    private String name;            // Название                     - Ме меньше 2 символов
    private Integer episodes_number;
    private Episode[] episodes=new Episode[3];     // массив с сериями этого сезона, на индексе 0 - находится серия 1
	private Integer season_duration;
    
    public Season(String name, Integer episodes_number) {
    	if(name.length()<2){System.out.println("Error");}else {
			this.name = name;}
		this.episodes_number = episodes_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()<2){System.out.println("Error");}else {
			this.name = name;}
	}

	public Integer getEpisodes_number() {
		return episodes_number;
	}

	public void setEpisodes_number(Integer episodes_number) {
		this.episodes_number = episodes_number;
	}
	public Episode getEpisode(Integer index){
		return episodes[index];
	}
	public void setEpisode(Integer index, Episode episode,Integer episode_duration) {
		episode.setDuration(episode_duration);
		this.episodes[index]=episode;
	}
	public Integer getDuration() {
		return this.season_duration;
	}
	public void setDuration(Episode episode) {
		for(int i = 0;i<episodes.length;i++){
		this.season_duration+=episodes[i].getDuration();
		}
	}

	@Override
	public String toString() {
		return getName()+"\n"+getEpisode(1)+"  "+"["+episodes[1].getDuration()
		   +"\n"+getEpisode(2)+"  "+"["+episodes[2].getDuration()+"]"
		   +"\n"+getEpisode(3)+"  "+"["+episodes[3].getDuration()+"]";
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
    
	public Episode(String name) {
		if(name.length()<2){System.out.println("Error");}else {
			this.name = name;}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()<2){System.out.println("Error");}else {
			this.name = name;}
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		if(duration<15||duration>100){System.out.println("Error");}else {
		this.duration = duration;}
	}

	@Override
	public String toString() {
		return "\"" + getName() + "\"  [" + getDuration() + "]";
	}
    
    // добавить конструктор + сеттеры / геттеры
    // добавить правила для проверки (используя String.length() / if/else)
    // добавить toString() он должен возвращать строку в таком формате
    // > "Episode Title"    [00:45]

}
