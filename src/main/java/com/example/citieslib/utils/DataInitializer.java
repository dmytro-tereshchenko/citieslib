package com.example.citieslib.utils;


import com.example.citieslib.models.City;
import com.example.citieslib.services.CityService;

public class DataInitializer {
        private CityService service;

        public DataInitializer(CityService service) {
            this.service = service;
        }

        public void Initialze(){
            if(service.findAllCities().size()==0) {
                City city = new City("Paris",
                        547865,
                        125,
                        25,
                        "Paris hosts several United Nations organisations: the UNESCO, " +
                                "the Young Engineers / Future Leaders, the World Federation " +
                                "of Engineering Organizations, and other international " +
                                "organisations such as the OECD, the OECD Development Centre, " +
                                "the International Bureau of Weights and Measures, the International " +
                                "Energy Agency, the International Federation for Human Rights, " +
                                "the International Organisation of La Francophonie; along with European " +
                                "bodies such as the European Space Agency, the European Banking Authority " +
                                "or the European Securities and Markets Authority. Other international " +
                                "organisations were founded in Paris such as the CIMAC in 1951 (International " +
                                "Council on Combustion Engines | Conseil International des Machines à Combustion), " +
                                "or the modern Olympic Games in 1894 which was then moved to Lausanne, Switzerland.");
                service.createCity(city);

                city = new City("London",
                        2547125,
                        84,
                        65,
                        "As one of the world's major global cities, London exerts a strong influence on " +
                                "its arts, entertainment, fashion, education, commerce and finance, health care, " +
                                "media, science and technology, tourism, and communications. Its GDP (€801.66 " +
                                "billion in 2017) makes it the biggest urban economy in Europe, and it is one of " +
                                "the major financial centres in the world.");
                service.createCity(city);

                city = new City("Berlin",
                        1452548,
                        21,
                        174,
                        "Berlin contains three World Heritage Sites: Museum Island; the Palaces and Parks of " +
                                "Potsdam and Berlin; and the Berlin Modernism Housing Estates.[25] Other landmarks " +
                                "include the Brandenburg Gate, the Reichstag building, Potsdamer Platz, the Memorial " +
                                "to the Murdered Jews of Europe, the Berlin Wall Memorial, the East Side Gallery, " +
                                "the Berlin Victory Column, Berlin Cathedral and the Berlin Television Tower, the tallest " +
                                "structure in Germany. Berlin has numerous museums, galleries, libraries, orchestras, " +
                                "and sporting events.");
                service.createCity(city);

                city = new City("Madrid",
                        3254154,
                        -25,
                        69,
                        "The Madrid urban agglomeration has the second-largest GDP in the European Union and its " +
                                "influence in politics, education, entertainment, environment, media, fashion, science, " +
                                "culture, and the arts all contribute to its status as one of the world's major global " +
                                "cities. Due to its economic output, high standard of living, and market size, Madrid is " +
                                "considered the major financial centre and the leading economic hub of the Iberian Peninsula " +
                                "and of Southern Europe. The metropolitan area hosts major Spanish companies such as " +
                                "Telefónica, Iberia, BBVA and FCC. It concentrates the bulk of banking operations in " +
                                "the country and it is the Spanish-speaking city generating the largest amount of webpages.");
                service.createCity(city);

                city = new City("Mexico",
                        4125987,
                        -65,
                        -145,
                        "Mexico is a developing country, ranking 74th on the Human Development Index, but has " +
                                "the world's 15th-largest economy by nominal GDP and the 11th-largest by PPP, with " +
                                "the United States being its largest economic partner. Its large economy and population, " +
                                "global cultural influence, and steady democratization make Mexico a regional and middle " +
                                "power; it is often identified as an emerging power but is considered a newly industrialized " +
                                "state by several analysts. However, the country continues to struggle with social inequality, " +
                                "poverty and extensive crime. It ranks poorly on the Global Peace Index, due in large part " +
                                "to ongoing conflict between the government and drug trafficking syndicates, which violently " +
                                "compete for the US drug market and trade routes. This \"drug war\" has led to over 120,000 " +
                                "deaths since 2006.");
                service.createCity(city);
            }
        }
}
