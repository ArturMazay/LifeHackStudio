package com.aistudio.lifehackstudio.domainimport com.aistudio.lifehackstudio.domain.cardCompanyRepository.CardCompanyRepositoryimport com.aistudio.lifehackstudio.domain.cardCompanyRepository.CardCompanyRepositoryImplimport com.aistudio.lifehackstudio.domain.companyRepository.CompanyRepositoryimport com.aistudio.lifehackstudio.domain.companyRepository.CompanyRepositoryImplimport org.koin.dsl.moduleval domainModule = module {    single<CompanyRepository> { CompanyRepositoryImpl(companyDataSource = get()) }    single<CardCompanyRepository> { CardCompanyRepositoryImpl(cardCompanyDataSource = get()) }}