[![Kotlin](https://img.shields.io/badge/Kotlin-Yes%20Please-BB42B0.svg)]()
[![Author](https://img.shields.io/badge/Author-code--schreiber-1A237E.svg)](https://github.com/code-schreiber)
[![Open Source Love svg3](https://badges.frapsoft.com/os/v3/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badges/)
[![Build Status](https://travis-ci.org/code-schreiber/ReviewMe.svg?branch=master)](https://travis-ci.org/code-schreiber/ReviewMe) 
![CI](https://github.com/errysuprayogi/ReviewMe/workflows/CI/badge.svg?branch=workflows)![CI](https://github.com/errysuprayogi/ReviewMe/workflows/CI/badge.svg?branch=workflows)  
  
<p align="center">
 <img src='https://avatars2.githubusercontent.com/u/51477052' width='100' height='100'/>
 <br>
 <b>ReviewMe</b>
 <br>
 🔎 👩🏽‍💻️ Automated code reviews 👨🏽‍💻️ 🔍
</p>
  
___
Life is short ⏳, let the bots review the code 🤖  
Inspired by the idea of [opinionated and automated code formatting](https://www.thoughtworks.com/radar/techniques), 
this is a sample setup to automate pull requests comments about code formatting and code smells for kotlin in android.
The warnings come from Detekt, ktlint and AndroidLint.

See a pull request example [here](https://github.com/code-schreiber/ReviewMe/pull/1)
![Review comment](https://raw.githubusercontent.com/code-schreiber/ReviewMe/master/screenshots/Review%20comment.png)
![AndroidLint comment](https://raw.githubusercontent.com/code-schreiber/ReviewMe/master/screenshots/AndroidLint.png)

#### Notes
- For a multi-module setup see [this article](https://blog.bitrise.io/automating-code-review-tasks-for-multi-module-android-projects)
- Run Danger locally using `bundle exec danger dry_run` if you want to test without a bot.

###### Used technologies
[Danger](https://danger.systems)  
[Detekt](https://arturbosch.github.io/detekt/index.html)  
[ktlint](https://github.com/pinterest/ktlint)  
[Travis CI](https://travis-ci.org/code-schreiber/ReviewMe)  
