package com.shivaot.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    PortfolioRepository portfolioRepository;

    @Autowired
    public DatabaseSeeder(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<UserPortfolio> portfolioList = new ArrayList<>();

        portfolioList.add(new UserPortfolio("abhay","theabhaychauhan","abhay@yahoo.in",99999999,"fbahndle","linkedinhandel","instahandle","engg","delhi","idk"));
        portfolioList.add(new UserPortfolio("abhay","theabhaychauhan","abhay@yahoo.in",99999999,"fbahndle","linkedinhandel","instahandle","engg","delhi","idk"));
        portfolioList.add(new UserPortfolio("abhay","theabhaychauhan","abhay@yahoo.in",99999999,"fbahndle","linkedinhandel","instahandle","engg","delhi","idk"));

        portfolioRepository.saveAll(portfolioList);
    }
}
